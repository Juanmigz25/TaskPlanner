module TaskPlanner {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.planner to javafx.fxml;
    exports com.planner;
}