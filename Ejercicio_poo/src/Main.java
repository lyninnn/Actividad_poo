public class Main {
    public static void main(String[] args) {


        String luis = "enterado";

        User linyi = new User("linyi", "hola mundo");
//        linyi.name="Linyi";
//        linyi.login="hola";
//        linyi.password="mundo";





//        linyi.setName("linyi");
        System.out.println(linyi.getPerfil().getColor()+" - "+linyi.getPerfil().getSize());
        linyi.getPerfil().setColor("14");
        System.out.println(linyi.getPerfil().getColor()+" - "+linyi.getPerfil().getSize());



//        linyi.perfil.color;
//        System.out.println(linyi.perfil.color);
////        linyi.setPerfil();
//        linyi.perfil.setColor("yellow");
//        System.out.println(linyi.perfil.color+" - "+linyi.getPerfil());

    }
}