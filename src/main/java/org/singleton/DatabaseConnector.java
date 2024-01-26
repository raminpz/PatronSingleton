package org.singleton;

/**
 * REGLAS PARA IMPLEMENTETAR SINGLETON:
 * 1) Debemos tener un constructor privado / We need to have an empty constructor
 * 2) Debemos tener un atributo privado estatico / We need to have a static private attribute
 * 3) Debemos tener un metodo estatico que devuelva la instancia / We need to have a public static method wich returns the instance
 */
public class DatabaseConnector {

    private static DatabaseConnector databaseConnector;

    private DatabaseConnector(){
        System.out.println("Creating object ");
    }

    public static synchronized DatabaseConnector getInstance(){
        if (databaseConnector == null){
            databaseConnector = new DatabaseConnector();
        }
        return databaseConnector;
    };

    public void connectDatabase(){
        System.out.println("Connecting database = " + databaseConnector);
    }
    public void disconnectDatabase(){
        System.out.println("Disconnecting database = " + databaseConnector);
    }
}
