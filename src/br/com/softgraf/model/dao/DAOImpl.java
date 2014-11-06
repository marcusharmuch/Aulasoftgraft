package br.com.softgraf.model.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;

public class DAOImpl<T> implements DAO<T> {

	private Class<T> classe;
	private Session session;
	
	public DAOImpl(Class<T> classe,Session session)
	{
		super();
		this.classe = classe;
		this.session = session;
				
	}
	
	@Override
	public void salvar(T bean) {
		session.save(bean);
		
		
	}

	@Override
	public void atualizar(T bean) {
		session.update(bean);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(T bean) {
		session.delete(bean);
		// TODO Auto-generated method stub
		
	}

	@Override
	public T getBean(Serializable codigo) {
		T bean = (T)session.get(classe, codigo);
		
		return bean;
		
	}

	@Override
	public List<T> getBeans() {
		List<T> beans= (List<T>)session.createCriteria(classe).list();
		
		return beans;
		
		
	}

}
