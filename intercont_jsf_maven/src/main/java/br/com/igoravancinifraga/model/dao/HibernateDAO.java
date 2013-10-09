package br.com.igoravancinifraga.model.dao;

//implementamos

import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;


public class HibernateDAO<T> implements InterfaceDAO<T>,Serializable
{
    //definimos 3 atributos padrao
    private static final long serialVersionUID = 1L;
    private Class<T> classe;
    private Session session;
    
    //construtor - certo
    //ao se criar uma instancia desta classe,
    //obrigaremos que seja passado a classe na qual será construido um DAO e a sessao do Hibernate

    public HibernateDAO(Class<T> classe, Session session) {
        super();
        this.classe = classe;
        this.session = session;
    }
    
    @Override
    public void save(T entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(T entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void remove(T entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void merge(T entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public T getEntity(Serializable id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public T getEntityByDetachedCriteria(DetachedCriteria criteria) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<T> getEntities() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<T> getListByDetachedCriteria(DetachedCriteria criteria) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
