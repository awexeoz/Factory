class PizzaFactory{
    public Pizza createPizza(String pizzaType){
        if(pizzaType.equalsIgnoreCase("Пепперони")){
            return new PepperoniPizza();
        }
        else if(pizzaType.equalsIgnoreCase("Маргарита")){
            return new MargheritaPizza();
        }
        else if(pizzaType.equalsIgnoreCase("Гавайская")){
            return new HawaiianPizza();
        }
        else{
            return null;
        }
    }
}
