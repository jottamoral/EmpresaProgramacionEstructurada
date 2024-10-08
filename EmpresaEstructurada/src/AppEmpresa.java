public class AppEmpresa {
    public static void main(String[] args) throws Exception {
        double total = 0;

        //Definicion de las estructuras de almacenamiento
        Arraylist<String> nombres = new Arraylist<String>();
        Arraylist<String> cargos = new Arraylist<String>();
        Arraylist<Double> salarios = new Arraylist<Double>();
        
        int cantidad = integer.parseInt(JOtion.Pane.showInputDialog(parentComponent:null, message:"Ingresar la cantidad de empleados"))

        for(int emp = 0; emp < cantidad; emp++){
            //Lectura de los datos de un empleado 
            String nombre = JOptionPane.showInputDialog(parentComponent:null, message:"Ingrese el nombre del empleado ");
            String cargo = JOptionPane.showInputDialog(parentComponent:null, message:"Ingrese el cargo del empleado ");
            double salario = Double.parseDouble(JOptionPane.showInputDialog(parentComponent:null, message:"Ingrese el salario del empleado ");

            //Almacenamiento de los datos en el Arraylist
            nombres.add(nombre);
            cargos.add(cargo);
            salarios.add(salario);
        }

            //Numero de empleados 
            System.out.println(x:"El numero de empleados es: "+ cantidad);

            //Nombre y salario de cada empleado 
            System.out.println(x:"Los nombres y salarios de los empleados son: ");
            for(int i = 0; i < cantidad; i++){
                System.out.println(x:"Nombre: " + nombres.get(i) + " Salario: " + salarios.get(i));
        
            }

            //El total de dinero pagado por los empleados 
            for(int i = 0; i < cantidad; i++){
                total = total + salarios.get(i);
                total += salarios.get(i);
            }
            System.out.println(x:"Total de dinero pagado a todos los empleados es: " + total);

            //Nombre, cargo y salario del empleado que mas gana 
            int posicion = 0;
            double mayorSalario = salarios.get(index:0);
            for(int i = 1; i < cantidad; i++){
                if(salarios.get(i) > mayorSalario){
                    mayorSalario = salarios.get(i);
                    posicion = i;
                }
            } 
            System.out.println("Nombre: " + nombre.get(posicion) + " Cargo: " + cargos.get(posicion + " Salario: " + salarios.get(posicion)));
            
        }
    }   
}
