package com.example.orquoll.swen90014_2018_or_quoll.db.initializeData;

import com.example.orquoll.swen90014_2018_or_quoll.db.DAO.DAOFactory;
import com.example.orquoll.swen90014_2018_or_quoll.entity.Tag_Action;

public class Tag_ActionData {
    private DAOFactory newDAOFactory;

    public Tag_ActionData (){
        this.newDAOFactory = new DAOFactory();
    }

    private void saveTag_Action(long tag_Id,long action_Id){
        Tag_Action tag_action = new Tag_Action(tag_Id,action_Id);
        tag_action.save();
    }

    public void saveAll(){
        saveTag_Action(22,4);
        saveTag_Action(22,6);
        saveTag_Action(24,6);
        saveTag_Action(11,8);
        saveTag_Action(22,8);
        saveTag_Action(20,12);
        saveTag_Action(23,12);
        saveTag_Action(19,13);
        saveTag_Action(20,13);
        saveTag_Action(23,13);
        saveTag_Action(14,14);
        saveTag_Action(20,14);
        saveTag_Action(23,14);
        saveTag_Action(24,23);
        saveTag_Action(24,25);
        saveTag_Action(24,26);
        saveTag_Action(24,27);
        saveTag_Action(24,28);
        saveTag_Action(16,29);
        saveTag_Action(17,29);
        saveTag_Action(16,30);
        saveTag_Action(17,30);
        saveTag_Action(16,31);
        saveTag_Action(17,31);
        saveTag_Action(16,32);
        saveTag_Action(17,32);
        saveTag_Action(16,33);
        saveTag_Action(17,33);
        saveTag_Action(16,34);
        saveTag_Action(17,34);
        saveTag_Action(16,35);
        saveTag_Action(17,35);
        saveTag_Action(16,37);
        saveTag_Action(17,37);
        saveTag_Action(16,38);
        saveTag_Action(17,38);
        saveTag_Action(16,39);
        saveTag_Action(17,39);
        saveTag_Action(16,40);
        saveTag_Action(17,40);
        saveTag_Action(20,40);
        saveTag_Action(16,41);
        saveTag_Action(17,41);
        saveTag_Action(16,42);
        saveTag_Action(17,42);
        saveTag_Action(10,43);
        saveTag_Action(11,43);
        saveTag_Action(18,43);
        saveTag_Action(11,44);
        saveTag_Action(20,44);
        saveTag_Action(23,44);
        saveTag_Action(12,45);
        saveTag_Action(13,45);
        saveTag_Action(19,45);
        saveTag_Action(12,46);
        saveTag_Action(13,46);
        saveTag_Action(19,46);
        saveTag_Action(12,47);
        saveTag_Action(13,47);
        saveTag_Action(19,47);
        saveTag_Action(12,48);
        saveTag_Action(13,48);
        saveTag_Action(19,48);
        saveTag_Action(12,49);
        saveTag_Action(13,49);
        saveTag_Action(19,49);
        saveTag_Action(19,50);
        saveTag_Action(20,50);
        saveTag_Action(23,50);
        saveTag_Action(12,51);
        saveTag_Action(13,51);
        saveTag_Action(19,51);
        saveTag_Action(20,51);
        saveTag_Action(23,51);
        saveTag_Action(12,52);
        saveTag_Action(13,52);
        saveTag_Action(19,52);
        saveTag_Action(12,54);
        saveTag_Action(13,54);
        saveTag_Action(19,54);
        saveTag_Action(12,55);
        saveTag_Action(13,55);
        saveTag_Action(19,55);
        saveTag_Action(13,56);
        saveTag_Action(19,56);
        saveTag_Action(18,58);
        saveTag_Action(21,58);
        saveTag_Action(18,59);
        saveTag_Action(21,59);
        saveTag_Action(12,61);
        saveTag_Action(13,61);
        saveTag_Action(19,61);
        saveTag_Action(21,61);
        saveTag_Action(14,67);
        saveTag_Action(20,67);
        saveTag_Action(23,67);
        saveTag_Action(12,68);
        saveTag_Action(13,68);
        saveTag_Action(19,68);
        saveTag_Action(12,69);
        saveTag_Action(13,69);
        saveTag_Action(14,70);
        saveTag_Action(19,75);
        saveTag_Action(21,75);
        saveTag_Action(14,76);
        saveTag_Action(21,76);
        saveTag_Action(18,77);
        saveTag_Action(20,77);
        saveTag_Action(23,77);
        saveTag_Action(10,78);
        saveTag_Action(19,78);
        saveTag_Action(20,78);
        saveTag_Action(23,78);
        saveTag_Action(20,80);
        saveTag_Action(13,84);
        saveTag_Action(19,84);
        saveTag_Action(20,84);
        saveTag_Action(13,85);
        saveTag_Action(19,85);
        saveTag_Action(20,85);
        saveTag_Action(12,86);
        saveTag_Action(13,86);
        saveTag_Action(19,86);
        saveTag_Action(20,86);
        saveTag_Action(14,87);
        saveTag_Action(20,87);
        saveTag_Action(22,87);
        saveTag_Action(19,92);
        saveTag_Action(20,92);
        saveTag_Action(11,101);
        saveTag_Action(19,101);
        saveTag_Action(20,101);
        saveTag_Action(14,103);
        saveTag_Action(20,103);
        saveTag_Action(22,103);
        saveTag_Action(20,104);
        saveTag_Action(23,104);
        saveTag_Action(20,106);
        saveTag_Action(23,106);
        saveTag_Action(14,109);
        saveTag_Action(20,109);
        saveTag_Action(23,109);
        saveTag_Action(18,112);
        saveTag_Action(14,120);
        saveTag_Action(20,120);
        saveTag_Action(23,120);
        saveTag_Action(22,125);
        saveTag_Action(19,130);
        saveTag_Action(20,130);
        saveTag_Action(23,130);
        saveTag_Action(12,136);
        saveTag_Action(13,136);
        saveTag_Action(11,137);
        saveTag_Action(13,137);
        saveTag_Action(22,137);
        saveTag_Action(10,144);
        saveTag_Action(20,144);
        saveTag_Action(22,147);
        saveTag_Action(19,148);
        saveTag_Action(12,151);
        saveTag_Action(13,151);
        saveTag_Action(14,155);
        saveTag_Action(22,155);
        saveTag_Action(10,159);
        saveTag_Action(11,159);
        saveTag_Action(14,160);
        saveTag_Action(19,160);
        saveTag_Action(23,160);
        saveTag_Action(20,161);
        saveTag_Action(22,161);
        saveTag_Action(14,168);
        saveTag_Action(15,168);
        saveTag_Action(22,172);
        saveTag_Action(18,191);
        saveTag_Action(19,191);

    }
}
