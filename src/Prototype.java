// Протатип нужен для созданий копий заданого объекта
public class Prototype {
    public static void main(String[] args){
        Project master = new Project(1,"Project", "code");
        System.out.println(master);
        FactoryProject factoryProject = new FactoryProject(master);
        Project masterclone = factoryProject.cloneProject();
        System.out.println("\n-------------------------------\n");
        System.out.println(masterclone);

    }
}
 interface Copyable {
    Object copy();
}


class FactoryProject {
    Project project;

    public FactoryProject(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    Project cloneProject() {
        return (Project) project.copy();
    }
}
class Project implements Copyable {
    private int id;
    private String name;
    private String code;

    public Project(int id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public Object copy() {
        Project copy = new Project(id, name, code);
        return copy;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
