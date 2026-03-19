module com.example.nclan_ac_converter_dw {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.ikonli.javafx;
    requires java.desktop;


    requires org.kordamp.ikonli.core;
    requires org.kordamp.ikonli.fontawesome5;
    //requires openai.java.core;
    //requires openai.java.client.okhttp;
    requires com.google.genai;


    opens nclan.ac.spa to javafx.fxml;
    exports nclan.ac.spa;
    exports nclan.ac.spa.controllers;
    opens nclan.ac.spa.controllers to javafx.fxml;
}