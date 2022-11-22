package org.samples;

import org.testng.annotations.DataProvider;

public class Datas {

	@DataProvider(name="login")
	private Object[][] data() {
	Object[][] obj=new Object[][] {
		{"Srini","Vasan"	},
		{"Avinash","11111"	},
		{"Dhinesh","22222"},
		{"Prakash","33333"	},
		{"jaya","44444"	},
		{"tamil","55555"	}
	};
	return obj;
}
}
