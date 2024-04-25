module br.com.catozzomarcos.loja {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.persistence;


	opens br.com.project.marcos.produto to javafx.fxml;
	exports br.com.project.marcos.produto;
	exports br.com.project.marcos.produto.mode;
	opens br.com.project.marcos.produto.mode to javafx.fxml;
}