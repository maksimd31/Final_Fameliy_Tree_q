package OldClass;

import Homework_6.Designer_Human;
import Homework_6.Femily_Tree;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.in;

public class SearchEngines extends Femily_Tree {

    Designer_Human designer_human;

    /*
    ПОИСКОВИКИ
     */

    /**
     * Поиск по имени
     *
     * @return Возвращает поле humans
     */
    public List<Designer_Human> showName() {
        Scanner iScanner = new Scanner(in);
        String name = iScanner.nextLine();
        for (Designer_Human human : designer_human.getHumans()) {
            if (Objects.equals(human.getName(), name)) {
                designer_human.getHumans().add((Designer_Human)designer_human.getHumans());
            }
        }
        return designer_human.getHumans();
    }


    /**
     * Поиск человека
     *
     * @param humans
     */
    public void searchHuman(List<Designer_Human> humans) {
        Scanner iScanner = new Scanner(in);
        System.out.println("Введите имя человека для поиска: ");
        String human = iScanner.nextLine();
        for (Designer_Human с : humans) {
            if (human.equals(с.getName())) {
                System.out.println(с);
            } else {
                System.out.println("Нет людей с таким именем.");
            }
            break;
        }
    }

    public  void  showNamee(List<Designer_Human> humans) {
        Scanner iScanner = new Scanner(in);
        String name = iScanner.nextLine();
        for (Designer_Human human : humans) {
            if (Objects.equals(human.getName(), name)) {
                humans.add((Designer_Human) designer_human.getHumans());
                forEach(System.out::println);
            }
        }
    }
}
