module edu.farmingdale.ap_lab_2_20_jd {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.farmingdale.ap_lab_2_20_jd to javafx.fxml;
    exports edu.farmingdale.ap_lab_2_20_jd;
}