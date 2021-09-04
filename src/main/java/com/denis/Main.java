package com.denis;

import com.denis.controller.Controller;
import com.denis.model.Model;
import com.denis.view.View;

public class Main {
    public static void main(String... args){
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.processUser();
    }
}
