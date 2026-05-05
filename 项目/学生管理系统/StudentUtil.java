import java.util.ArrayList;

public class StudentUtil {
    private ArrayList<Student> list = new ArrayList<>();

    public void addStudent(Student s) {
        list.add(s);
    }

    public void deleteStudent(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                list.remove(i);
                return;
            }
        }
    }

    public void updateStudent(Student s) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(s.getId())) {
                list.set(i, s);
                return;
            }
        }
    }

    public ArrayList<Student> findAll() {
        return list;
    }

    public boolean exists(String id) {
        for (Student s : list) {
            if (s.getId().equals(id)) return true;
        }
        return false;
    }
}