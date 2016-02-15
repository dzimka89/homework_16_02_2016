package Emploee;

public class Employer {
    Employer boss;
    Employer anotherBoss;
    String name;
    String company;

    public Employer(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public Employer(String name, String company, Employer boss, Employer anotherBoss) {
        this.boss = boss;
        this.anotherBoss = anotherBoss;
        this.name = name;
        this.company = company;
    }

    public Employer(String name, String company, Employer boss) {
        this.boss = boss;
        this.name = name;
        this.company = company;
    }

    public Employer getBoss() {
        return boss;
    }

    public void setBoss(Employer boss) {
        this.boss = boss;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Employer getAnotherBoss() {
        return anotherBoss;
    }

    public void setAnotherBoss(Employer boss1) {
        this.anotherBoss = boss1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employer employer = (Employer) o;

        if (boss != null ? !boss.equals(employer.boss) : employer.boss != null) return false;
        if (anotherBoss != null ? !anotherBoss.equals(employer.anotherBoss) : employer.anotherBoss != null)
            return false;
        if (name != null ? !name.equals(employer.name) : employer.name != null) return false;
        return !(company != null ? !company.equals(employer.company) : employer.company != null);

    }

    @Override
    public int hashCode() {
        int result = boss != null ? boss.hashCode() : 0;
        result = 31 * result + (anotherBoss != null ? anotherBoss.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (company != null ? company.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "boss=" + boss +
                ", anotherBoss=" + anotherBoss +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
