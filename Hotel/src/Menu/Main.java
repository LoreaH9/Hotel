package Menu;
import Utils.LO;

public class Main {

	public static void main(String[] args) {
		
		MainKudeatzailea kude = new MainKudeatzailea ();
		int aukera;
		
		do {
			kude.menuLogin();
			aukera = Integer.parseInt(LO.read());
		}while(aukera>2);
		
			switch (aukera) {
			case 0: kude.cero(); break;
			
			case 1:
				MainKudeatzailea MK = new MainKudeatzailea ();
				boolean sartu = MK.login();
				
				if (sartu) {
					int aukera1, aukera2;
					
					do {
						kude.menuGestor();
						aukera1 = Integer.parseInt(LO.read());
						switch (aukera1) {
						case 0: kude.cero(); break;
						case 1:
							kude.menuCliente();
							aukera2=Integer.parseInt(LO.read());
							ClienteKudeatzailea CK = new ClienteKudeatzailea();

							switch(aukera2) {
								case 0: kude.cero(); break;
								case 1: CK.verClientes(); break;
								case 2: CK.aniadirCliente(); break;
								case 3: CK.eliminarCliente(); break;
								case 4: CK.modificarCliente();	break;		
								default: kude.def();

							}
							break;
							
						case 2:
							kude.menuHotel();
							aukera2=Integer.parseInt(LO.read());
							HotelKudeatzailea HK = new HotelKudeatzailea();
								
							switch(aukera2) {
								case 0: kude.cero(); break;
								case 1: HK.verHoteles(); break;
								case 2: break;
								case 3: HK.aniadirHotel(); break;
								case 4:break;
								case 5: HK.eliminarHotel(); break;
								case 6:break;
								case 7: HK.modificarHotel(); break;
								case 8: break;
								default: kude.def();

								}
							break;

						case 3:
							kude.menuReserva();
							aukera2=Integer.parseInt(LO.read());
							ReservaKudeatzailea RK = new ReservaKudeatzailea ();
							
							switch(aukera2) {
								case 0: kude.cero(); break;
								case 1: RK.seSolapan(); break;
								default: kude.def();
								} 
							break;
							
						default: kude.def();

							}	
				}while (aukera1!=0);	
			}		
		}
	}
}
