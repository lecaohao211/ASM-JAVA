package demoasm;

import java.util.ArrayList;

public class Data {
    private ArrayList<Teacher> list;
    private String fileName;


    public Data() {
        this.list = new ArrayList<>();
        this.fileName = "";
    }

    public ArrayList<Teacher> getList() {
        return list;
    }

    public void setList(ArrayList<Teacher> list) {
        this.list = list;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void insert(Teacher teacher) {
        list.add(teacher);
    }

    public void delete(Teacher teacher) {
        int index =-1;
        for(int i = 0; i<this.list.size(); i++) {
            if(teacher.getId() == this.list.get(i).getId()) {
                index = i;
            }
        }
        this.list.remove(index);
    }

    public void update(Teacher teacher, int indexDelete) {
        this.list.remove(indexDelete);
        this.list.add(teacher);
    }

    public boolean checkIfExist(Teacher teacher) {
        for (Teacher teacher1 : list) {
            if(teacher1.getId() == teacher.getId()) {
                return true;
            }
        }
        return false;
    }

}
