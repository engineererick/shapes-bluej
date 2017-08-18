class Casa {
    //Variables de instancia
    Circle ventana;
    Triangle techo;
    Square pared;
    Square puerta;
    
    //Constructor
    Casa() {
        ventana = new Circle();
        techo = new Triangle();
        pared = new Square();
        puerta = new Square();
    }
    
    void dibujate(){
        techo.makeVisible();
        pared.makeVisible();
        puerta.makeVisible();
        ventana.makeVisible();
    }
    
    void acomodate(){
        techo.moveHorizontal(80);
        techo.changeSize(50, 120);
        pared.moveHorizontal(30);
        pared.moveVertical(15);
        pared.changeSize(80);
        puerta.changeColor("brown");
        puerta.moveHorizontal(52);
        puerta.moveVertical(60);
        puerta.changeSize(35);
        ventana.moveHorizontal(95);
        ventana.moveVertical(-30);
    }
    
    void dibujaMas() {
        Casa casaX = new Casa();
        casaX.dibujate();
        casaX.acomodate();
   
    }
}
