import java.applet.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*<applet code="VotingSystem.class" height=300 width=300></applet> */

public class VotingSystem extends Applet {

    private int bjp = 0;
    private int congress = 0;
    private int aap = 0;
    private int bsp = 0;
    private int nota = 0;

    private Button bjpButton;
    private Button congressButton;
    private Button aapButton;
    private Button bspButton;
    private Button notaButton;
    private Button resultsButton;

    private Frame resultsFrame;
    

    public VotingSystem() {
        setLayout(new GridLayout(3, 2));

        bjpButton = new Button("BJP");
        congressButton = new Button("Congress");
        aapButton = new Button("AAP");
        bspButton = new Button("BSP");
        notaButton = new Button("NOTA");
        resultsButton = new Button("Results");

        add(bjpButton);
        add(congressButton);
        add(aapButton);
        add(bspButton);
        add(notaButton);
        add(resultsButton);

        bjpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bjp++;
            }
        });

        congressButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                congress++;
            }
        });

        aapButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aap++;
            }
        });

        bspButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bsp++;
            }
        });

        notaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nota++;
            }
        });

        resultsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create a new frame to display the results
                resultsFrame = new Frame("Results");
                //resultsFrame.setDefaultClosingOperation(EXIT_ON_CLOSE);
                // Get the winner
                String winner = getWinner();

                // Add a label to the frame to display the winner
                resultsFrame.add(new JLabel("The winner is: " + winner));

                // Display the frame
                resultsFrame.setSize(300, 300);
                resultsFrame.setVisible(true);
                
            }
        });
        
        
    }

    private String getWinner() {
        int maxVotes = 0;
        String winner = "";

        if (bjp > maxVotes) {
            winner = "BJP";
            maxVotes = bjp;
        }

        if (congress > maxVotes) {
            winner = "Congress";
            maxVotes = congress;
        }

        if (aap > maxVotes) {
            winner = "AAP";
            maxVotes = aap;
        }

        if (bsp > maxVotes) {
            winner = "BSP";
            maxVotes = bsp;
        }

        return winner;
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}