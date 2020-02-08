package Assignment4;
public abstract class DessertItem extends java.lang.Object {
protected java.lang.String name;

public DessertItem() {
	
}

public DessertItem(java.lang.String name) {
	int n = name.length();
	 if (n <= DessertShoppe.maxsizeofItem) {
         this.name = name;
	 }
 }


public final java.lang.String getName() {
	return name;
	}

public abstract int getCost();
}
