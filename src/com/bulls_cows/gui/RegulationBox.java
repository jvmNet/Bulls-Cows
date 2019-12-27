package com.bulls_cows.gui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class RegulationBox {

    private static Stage window;

    public static void regulationGame(){
        window = new Stage();
        window.setResizable(false);
        window.setTitle("Правила игры: ");
        window.getIcons().add(new Image(RegulationBox.class.getResourceAsStream("logo.png")));
        window.initModality(Modality.APPLICATION_MODAL);

        Button buttonCloseRegulationWindow = new Button();
        buttonCloseRegulationWindow.setText("Закрыть окно");
        buttonCloseRegulationWindow.setOnAction(e -> window.close());

        TextArea textRegulation = new TextArea();
        textRegulation.setMinHeight(470);
        textRegulation.setMinWidth(435);

        textRegulation.setText("" +
                "               Популярная народно-хороводная, логическая игра   " + "\n" +
        "                                      \"Быки и Коровы\"    " + "\n" +
        "   " + "\n" +
        "  Эта простая на первый взгляд игрушка, однако заставит Вас напрячь" + "\n" +
        "  то серое вещество, которое by default должно находиться внутри "   + "\n" +
        "  черепной коробки каждого человека." + "\n" +
        "   " + "\n" +
        "  Правила игры очень просты." + "\n" +
        "  1. Компьютер загадывает четырёхзначное число. Цифры в числе не  " + "\n" +
        "  повторяются." + "\n" +
        "  2. Вы пытаетесь это число угадать, называя наугад (и не очень) свои " + "\n" +
        "  варианты загаданного числа." + "\n" +
        "  3. На каждую вашу попытку, компьютер Вам сообщает кое-что про " + "\n" +
        "  соответствие между цифрами загаданного числа и вашего варианта, " + "\n" +
        "  а именно - количество \"быков\" и \"коров\":" + "\n" +
        "   " + "\n" +
        "     \"Быки\" - это те цифры вашего числа, расположение которых " + "\n" +
        "      поразрядно совпадает с цифрами загаданного числа; " + "\n" +
        "     \"Коровы\" - это те цифры вашего числа, которые присутствуют " + "\n" +
        "      в загаданном числе, но находятся в другом месте, (в другом " + "\n" +
        "      разряде, на другой позиции)." + "\n" +
        "   " + "\n" +
        "  Рассмотрим пример:" + "\n" +
        "   " + "\n" +
        "     Загадано число \"2308\"." + "\n" +
        "     В числе присутствуют цифры - 2, 3, 0, 8; " + "\n" +
        "     На ваши попытки  его    угадать, компьютер будет   отвечать    так: " + "\n" +
        "     1. \"1234\" - 0быков, 2коровы (\"коровы\" цифры 2 и 3, так как они " + "\n" +
        "     присутствуют в загаданном числе, но находятся не на своих  местах);" + "\n" +
        "     2. \"5678\" - 1б, 0к (\"бык\" это цифра 8, находится на 4-й позиции" + "\n" +
        "     т.е. на месте);" + "\n" +
        "     3. \"2380\" - 2 быка, 2 коровы ( 2,3 - быки, 8,0 - коровы, 2 и 3 на " + "\n" +
        "     местах, 8,0 не на местах)." + "\n" +
        "   " + "\n" +
        "  В среднем, пытливому уму требуется от  6  до 8  попыток, чтобы " + "\n" +
        "  отгадать любое 4-х значное число.");

        VBox container = new VBox(15);
        container.setPadding(new Insets(5,5,10,5));
        container.setAlignment(Pos.CENTER);
        container.getChildren().addAll(textRegulation,buttonCloseRegulationWindow);

        Scene scene = new Scene(container);
        window.setScene(scene);

        window.showAndWait();

    }
}
