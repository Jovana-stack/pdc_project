/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whowantstobe;

/**
 *
 * @author jovan
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class QuestionManager {
    private List<Questions> allQuestions; // List to store all available questions
    private Set<Questions> usedQuestions; // Set to keep track of used questions
    private Random random; // Random number generator for selecting questions

    public QuestionManager(List<Questions> allQuestions) {
        this.allQuestions = allQuestions;
        this.usedQuestions = new HashSet<>(); // Initialize the set of used questions
        this.random = new Random();// Initialize the random number generator
    }

    public Questions getUnusedQuestion() {
        List<Questions> unusedQuestions = new ArrayList<>(allQuestions);
        unusedQuestions.removeAll(usedQuestions); // Remove used questions from the list

        if (unusedQuestions.isEmpty()) {
            // If all questions have been used, reset the set of used questions.
            usedQuestions.clear();
            unusedQuestions.addAll(allQuestions);
        }

        int randomIndex = random.nextInt(unusedQuestions.size()); // Select a random index
        Questions question = unusedQuestions.get(randomIndex); // Get the question at the index

        usedQuestions.add(question); // Mark the question as used
        return question;
    }

    public void reset() {
        usedQuestions.clear(); // Reset the set of used questions
    }
}

    

