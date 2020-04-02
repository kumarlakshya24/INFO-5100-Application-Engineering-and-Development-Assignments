package dealersearch;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
@SuppressWarnings("serial")
public class MainFrame extends JFrame {
   protected JButton buttonSearch = new JButton("Search Dealers");
   protected JButton buttonSort = new JButton("Sort Dealers");

   protected JList<Dealer> listDealer = new JList<>(); //Builds read only instance of list for us
   protected DefaultListModel<Dealer> listModel; //Maintains the contents of the list
   protected java.util.List<Dealer> d = new ArrayList<>();

   public MainFrame() {
       super("Swing Search & Sort Test");

       initComponents();

       setSize(600, 480);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   protected void initComponents() {
       setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
       JPanel panelButton = new JPanel();
       panelButton.setLayout(new FlowLayout(FlowLayout.CENTER));

       buttonSort.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent evt) {
               sortDealer();
           }
       });

       buttonSearch.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent evt) {
               searchDealer();
           }
       });
       //listModel.addElement(new Dealer("John Doe", "Phone", "Address", "ID"));

       panelButton.add(buttonSearch);
       panelButton.add(buttonSort);

       add(panelButton);

       listDealer.setPreferredSize(new Dimension(400, 360));

       listModel = new DefaultListModel<Dealer>();
       listDealer.setModel(listModel);
   }


   private void sortDealer() {
       Collections.sort(d);
       int index = listModel.size();
     //Got this part from somewhere and trying to figure out how this works
       fireContentsChanged(listModel.get(index - 1), index, index); 
   }

   private void fireContentsChanged(Dealer dealer, int index, int index2) {
	// TODO Auto-generated method stub
	
}

private void searchDealer() {
       String dealerName = JOptionPane.showInputDialog(this, "Enter dealer name to search for:");
       String phoneNumber = JOptionPane.showInputDialog(this, "Enter dealer name to search for:");
       String address = JOptionPane.showInputDialog(this, "Enter dealer name to search for:");
       String id = JOptionPane.showInputDialog(this, "Enter dealer name to search for:");
       if (dealerName == null) {
           return;
       }

       Collections.sort(d);

       int foundIndex = Collections.binarySearch(d, new Dealer(dealerName, phoneNumber, address, id));

       if (foundIndex >= 0) {
           listDealer.setSelectedIndex(foundIndex);
       } else {
           JOptionPane.showMessageDialog(this, "Could not find the dealer " + dealerName);
       }
   }}
