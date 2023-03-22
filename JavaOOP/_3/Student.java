package JavaOOP._3;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private boolean isOffSite;
    private String favoriteSubject;
    private int voteInDecimal;
    private static int minAge = 18;
    private static int minVote = 0;
    private static int maxVote = 10;
    private List<Integer> voteRegister=new ArrayList<>();

    private int counterChangeSite=0;

    public int getCounterChangeSite() {
        return counterChangeSite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (minAge <= age) {
            this.age = age;
        } else {
            System.out.println("You must be of legal age to take the course");
        }
    }

    public boolean isOffSite() {
        return isOffSite;
    }

    public void setIsOffSite(boolean offSite) {
        counterChangeSite++;
        isOffSite = offSite;
    }

    public String getFavoriteSubject() {
        return favoriteSubject;
    }

    public void setFavoriteSubject(String favoriteSubject) {
        this.favoriteSubject = favoriteSubject;
    }

    public int getVoteInDecimal() {
        return voteInDecimal;
    }

    public void setVoteInDecimal(int voteInDecimal) {
        if (minVote <= voteInDecimal && maxVote >= voteInDecimal) {
            this.voteInDecimal = voteInDecimal;
            voteRegister.add(voteInDecimal);
        } else {
            System.out.println("The vote must be in tenths");
        }
    }
    public  void getVoteRegister(){
        for (int i=0; i<voteRegister.size(); i++) {
            System.out.println(voteRegister.get(i));
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isOffSite=" + isOffSite +
                ", favoriteSubject='" + favoriteSubject + '\'' +
                ", voteInDecimal=" + voteInDecimal +
                ", voteRegister=" + voteRegister +
                ", counterChangeSite=" + counterChangeSite +
                '}';
    }
}

