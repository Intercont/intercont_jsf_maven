package br.com.igoravancinifraga.model.dao;

//criamos a Interface DAO que recebe um tipo T Genérico, pode ser qualquer Entidade
//Lembrando que uma Interface é somente um molde para uma classe, algo como deve ser realizado

import java.io.Serializable;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;

//Vai ser implementada por todas as classes que vao acessar o banco de dados
public interface InterfaceDAO<T> 
{
    void save(T entity);
    void update(T entity);
    void remove(T entity);
    void merge(T entity);
    
    //recupera um objeto, recebe um ID
    T getEntity(Serializable id);    
    T getEntityByDetachedCriteria(DetachedCriteria criteria);
    
    List<T> getEntities();//Ctrl+Shift+Seta pra baixo copia a linha para baixo
    List<T> getListByDetachedCriteria(DetachedCriteria criteria);//Ctrl+Shift+I mostra as sugestoes de importaçao    
}
