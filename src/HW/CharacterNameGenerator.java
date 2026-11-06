package HW;

import java.util.ArrayList;
import java.util.Random;

public class CharacterNameGenerator {
    ArrayList<String> subjects = new ArrayList<>();
    ArrayList<String> objects = new ArrayList<>();
    ArrayList<String> attributes = new ArrayList<>();


    Random random = new Random();

    public String generatorSubjectObject(ArrayList subjects, ArrayList objects){
        if(subjects.isEmpty() || objects.isEmpty()){
            throw new IllegalArgumentException("Подлежащее или дополнение отсутствует");
        }
        StringBuilder stringBuilder = new StringBuilder();
        int randomIndex0 = random.nextInt(subjects.size());
        int randomIndex1 = random.nextInt(objects.size());
        stringBuilder.append(subjects.get(randomIndex0));
        stringBuilder.append(" ");
        stringBuilder.append(objects.get(randomIndex1));
        return stringBuilder.toString();
    }
    public String generatorAttributeSubjectObject(ArrayList subjects, ArrayList objects, ArrayList attributes){
        if (subjects.isEmpty() || objects.isEmpty() || attributes.isEmpty()){
            throw new IllegalArgumentException("Подлежащее, дополнение или определение отсутствует");
        }
        StringBuilder stringBuilder = new StringBuilder();
        int randomIndex0 = random.nextInt(subjects.size());
        int randomIndex1 = random.nextInt(objects.size());
        int randomIndex2 = random.nextInt(attributes.size());
        stringBuilder.append(attributes.get(randomIndex2));
        stringBuilder.append(" ");
        stringBuilder.append(subjects.get(randomIndex0));
        stringBuilder.append(" ");
        stringBuilder.append(objects.get(randomIndex1));
        return stringBuilder.toString();
    }
    public String generatorAttributeSubject(ArrayList subjects, ArrayList attributes){
        if (subjects.isEmpty() || attributes.isEmpty()){
            throw new IllegalArgumentException("Подлежащее или определение отсутствует");
        }
        StringBuilder stringBuilder = new StringBuilder();
        int randomIndex0 = random.nextInt(subjects.size());
        int randomIndex2 = random.nextInt(attributes.size());
        stringBuilder.append(attributes.get(randomIndex2));
        stringBuilder.append(" ");
        stringBuilder.append(subjects.get(randomIndex0));
        return stringBuilder.toString();
    }






}
