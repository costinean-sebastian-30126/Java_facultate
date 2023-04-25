package isp.lab9.exercise1.ui;

import javax.swing.*;

/**
 *  todo: implement portfolio panel; for each owned stock add symbol, quantity, price per unit, total price of the position
 *  it should look similar to the 'Market' panel
 */
public class PortofolioJPanel extends JPanel {

    private StockMarketJFrame frame;

    public PortofolioJPanel(StockMarketJFrame frame) {
        this.frame = frame;
        initComponent();
    }

    private void initComponent() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JTable jTableMarket = new JTable();
        jTableMarket.setModel(frame.getPortfolio());
        JScrollPane marketScrollablePane = new JScrollPane(jTableMarket);

        add(marketScrollablePane);

    }
}
