package service.impl;

import db.Database;
import model.Group;
import model.Student;
import service.GroupService;

import javax.sql.rowset.Predicate;
import java.util.*;

public class GroupServiceImpl implements GroupService {
    private List<Database> database;

    @Override
    public String addNewGroup(Group group) {
        List<Group>groups=new ArrayList<>();
        System.out.println("Gruppaga at jazynyz");
        String  name=new Scanner(System.in).nextLine();
        System.out.println("Description  jazynyz");
        String  description=new Scanner(System.in).nextLine();
        for (Group group1 : groups) {
            groups.add(group1);
            System.out.println(group1.toString());




        }
        return name+" attu gruppa saktaldy";
    }

    @Override
    public String getGroupById(int id) {
        Group group=new Group();
        System.out.println("Write name id");
        String idName= new Scanner(System.in).nextLine();
        for (Database database1 : database) {
            for (Group group1 :database1.getGroups()) {
                if(Objects.equals(idName, group.getId())){
                    group=group1;
                    System.out.println(group);
                }
            }
        }
        return "Gruppalar";
    }

    @Override
    public List<Group> getAllGroups() {
        List<Group> groups=new ArrayList<>();
        return groups;
    }

    @Override
    public Database updateGroupName(int id, String groupName) {
        System.out.println("Write group name ");
        String gName= new Scanner(System.in).nextLine();
        System.out.println("Write id  ");
        String idName= new Scanner(System.in).nextLine();
            for (Database database1 : database) {
            for (Group  database2 :database1.getGroups() ) {
                if(database1.equals(groupName)&&database1.equals(id)){
                    database2.setName(gName);
                    database2.setId(Integer.parseInt(idName));
                }
            }
                return database1;
        }


        return null;
    }

    @Override
    public List<Group> filterByYear(int year, String ascDesc) {
        // (asc ди басканда ascending, desc ди басканда descending кылып сорттосун)

        List<Group> groupList = new ArrayList<>();
        List<Group> filteredList = new ArrayList<>();
        for (Group group : groupList) {
            if (group.getYear() == year) {
                filteredList.add(group);
            }
        }
        Comparator<Group> yearComparator = new Comparator<>() {
            public int compare(Group g1, Group g2) {
                if (ascDesc.equalsIgnoreCase("asc")) {
                    return g1.getYear() - g2.getYear();
                } else {
                    return g2.getYear() - g1.getYear();
                }
            }
        };
        Collections.sort(filteredList, yearComparator);
        return filteredList;
    }

    @Override
    public List<Group> sortGroupByYear(String ascDesc) {

            List<Group> groupList = new ArrayList<>();
            Comparator<Group> yearComparator = new Comparator<>() {
                public int compare(Group o1, Group o2) {
                    if (ascDesc.equalsIgnoreCase("asc")) {
                        return o1.getYear() - o2.getYear();
                    } else {
                        return o2.getYear() - o1.getYear();
                    }
                }
            };
            Collections.sort(groupList, yearComparator);
            return groupList;
    }

    @Override
    public void deleteGroupById(int id) {
        System.out.println("Write id  ");
        String idName= new Scanner(System.in).nextLine();
        for (Database database1 : database) {
            for (Group group : database1.getGroups()) {
                if(Objects.equals(idName, group.getId())){
                    database.remove(group);

                }

            }
        }
    }
}
