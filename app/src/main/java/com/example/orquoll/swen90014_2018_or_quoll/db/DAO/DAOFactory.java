package com.example.orquoll.swen90014_2018_or_quoll.db.DAO;

public class DAOFactory {

    public  ActionDAOImp getActionDAOImpInstance(){
        return new ActionDAOImp();
    }
}