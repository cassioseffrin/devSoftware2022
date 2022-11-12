package dao;

 

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import aula5Heranca.Cliente;
import database.MysqlSingleton;

 
public class FuncionarioDao {
	private Connection connection;

	public FuncionarioDao() {
		this.connection = MysqlSingleton.getConnection();
	}

	public boolean inserir(Cliente cliente) {
		String sql = "INSERT INTO  cliente (nome, cpf, rg, endereco, telefone) VALUES (?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getCpf());
			stmt.setString(3, cliente.getRg());
			stmt.setString(4, cliente.getEndereco());
			stmt.setString(5, cliente.getTelefone());
			stmt.execute();
			return true;
		} catch (Exception e) {
			Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, e);
			return false;
		}
	}

	public List<Cliente> listar() {
		String sql = "SELECT * FROM  cliente";
		List<Cliente> listaClientes = new ArrayList<>();
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet resultado = stmt.executeQuery();
			while (resultado.next()) {
				Cliente cliente = new Cliente();
				cliente.setNome(resultado.getString("nome"));
				cliente.setRg(resultado.getString("rg"));
				cliente.setCpf(resultado.getString("cpf"));
				cliente.setEndereco(resultado.getString("endereco"));
				cliente.setTelefone(resultado.getString("telefone"));
				listaClientes.add(cliente);
			}
		} catch (SQLException ex) {
			Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return listaClientes;
	}

	public boolean alterar(Cliente cliente) {
		String sql = "UPDATE cliente SET nome=?, rg=?, cpf=?, telefone=?, endereco=?  WHERE id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getRg());
			stmt.setString(3, cliente.getCpf());
			stmt.setString(4, cliente.getTelefone());
			stmt.setString(5, cliente.getEndereco());
			stmt.setInt(6, cliente.getId());
			stmt.execute();
			return true;
		} catch (SQLException ex) {
			Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
			return false;
		}
	}

	public boolean remover(Cliente cliente) {
		String sql = "DELETE FROM cliente WHERE id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, cliente.getId());
			stmt.execute();
			return true;
		} catch (SQLException ex) {
			Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
			return false;
		}
	}

	public Cliente buscar(Integer id) {
		String sql = "SELECT * FROM cliente WHERE id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet resultado = stmt.executeQuery();
			Cliente cliente = new Cliente();
			if (resultado.next()) {
				cliente.setId(resultado.getInt("id"));
				cliente.setNome(resultado.getString("nome"));
				cliente.setRg(resultado.getString("cpf"));
				cliente.setCpf(resultado.getString("rg"));
				cliente.setTelefone(resultado.getString("telefone"));
				cliente.setEndereco(resultado.getString("endereco"));
				return cliente;
			}
		} catch (SQLException ex) {
			Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

}
