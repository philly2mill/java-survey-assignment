package Swing;

import javax.swing.JOptionPane;

public class Survey {

    public static void main(String[] args) {
        String[] questions = {
            "How many players played well this season?\nA. 4 B. 7 C. 9",
            "How many points did Boswell score this season?\nA.3 B.40 C.114",
            "How many penalies did the Steelers have in game 3 of the season?\nA.1 B.3 C.0"
        };

        char[] answers = {'C', 'C', 'B'};
        char ans = ' ';
        int correct = 0;
        String incorrectQuestions = "";

        for (int x = 0; x < questions.length; ++x) {
            boolean isGood = false;

            while (!isGood) {
                String entry = JOptionPane.showInputDialog(
                    null, questions[x]
                );

                // Stop the program if the user selects Cancel.
                if (entry == null) {
                    return;
                }

                entry = entry.trim().toUpperCase();

                // Require one answer letter.
                if (entry.length() == 1
                        && (entry.charAt(0) == 'A'
                        || entry.charAt(0) == 'B'
                        || entry.charAt(0) == 'C')) {
                    ans = entry.charAt(0);
                    isGood = true;
                } else {
                    JOptionPane.showMessageDialog(
                        null, "Your answer must be A, B or C."
                    );
                }
            }

            if (ans == answers[x]) {
                ++correct;
                JOptionPane.showMessageDialog(null, "Correct!");
            } else {
                // Remember the number of each missed question.
                if (!incorrectQuestions.isEmpty()) {
                    incorrectQuestions += ", ";
                }

                incorrectQuestions += (x + 1);

                JOptionPane.showMessageDialog(
                    null, "The correct answer is " + answers[x]
                );
            }
        }

        if (incorrectQuestions.isEmpty()) {
            incorrectQuestions = "None";
        }

        JOptionPane.showMessageDialog(
            null,
            "You received " + correct + " right and\n"
            + (questions.length - correct) + " wrong\n"
            + "Incorrect questions: " + incorrectQuestions
        );
    }
}