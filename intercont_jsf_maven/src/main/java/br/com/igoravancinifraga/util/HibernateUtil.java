package br.com.igoravancinifraga.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class HibernateUtil {
    
    private static final SessionFactory sessionFactory; //sessao do Hibernate
    public static final String HIBERNATE_SESSION = "hibernate_session"; //constante que armazena a sessao
    
    static //bloco estático
    {
        try {
            System.out.println("Tentando abrir uma SessionFactory");
            //Instancia de Configuration - MUITA ATENÇAO A FONTE DA INSTANCIA
            Configuration configuration = new Configuration().configure();
            //Service Registry - TE DÁ MAIOR LIBERDADE PARA SOBREESCREVER MÉTODOS DO HIBERNATE, mais desacoplado 4.0.1            
            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().
                    applySettings(configuration.getProperties()).buildServiceRegistry();
            //caso nao esteja utilizando o Maven, se coloca o endereço do XML de argumento em getProperties do objeto configuration (linha acima)
            
            //setamos a sessionFactory
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);            
            
            System.out.println("SessionFactory criada com sucesso");
            
        } catch (Exception ex) 
        {
            System.out.println("Ocorreu um erro ao iniciar a SessionFactory"+ex);
            throw new ExceptionInInitializerError(ex);
            //Refatorando on the fly: Ao querer alterar o nome de uma variável em um código, pressione Ctrl+R sobre ela ou uma referencia dela e realize a alteraçao
            //todas suas referências, inclusive sua declaraçao passarao a ter essa denominaçao a partir de agora
        }
    
    
    }
    
    //CRIANDO GETTER AUTOMATICAMENTE PELO NETBEANS: ALT + Insert -> Getter... e escolha a Variável/Instancia
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    
    
}

/*
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
    
    private static final SessionFactory sessionFactory;
    public static final String HIBERNATE_SESSION = "hibernate_session";
    
    static{
        
        try {
            
            System.out.println("Tentando configurar a SF");
            
            Configuration configuration = new Configuration().configure();
            
            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().
                applySettings(configuration.getProperties()).buildServiceRegistry();
            
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            
            System.out.println("Session factory criada corretamente");
        } catch (Exception ex) {
            System.out.println("Ocorreu um  erro ao iniciar a SF. " + ex);
            throw new ExceptionInInitializerError(ex);
        }
        
        
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
}
*/