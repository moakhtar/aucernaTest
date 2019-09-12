/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aucernacodetask;

import aucerna.entities.Group;
import aucerna.entities.Well;
import static aucernacodetask.ImportedData.createGroup;
import static aucernacodetask.ImportedData.createWell;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author muhammadakhtar
 */
public class Importer {
    
    public static List<Well> getWells(String filename) throws IOException {
        List<Well> wells = new ArrayList<>();
        Path pathToFile = Paths.get(filename);

        // create an instance of BufferedReader
        // using try with resource, Java 7 feature to close resources
        try (BufferedReader br = Files.newBufferedReader(pathToFile)) {

            String line = br.readLine();

            while (line != null) {

                String[] attributes = line.split(",");
                if (attributes[0].contains("Well")) {
                    Well well = createWell(attributes);

                    wells.add(well);
                }

                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return wells;
    }
    
    public static List<Group> getGroups(String filename) throws IOException {
        List<Group> groups = new ArrayList<>();
        Path pathToFile = Paths.get(filename);

        // create an instance of BufferedReader
        // using try with resource, Java 7 feature to close resources
        try (BufferedReader br = Files.newBufferedReader(pathToFile)) {

            String line = br.readLine();

            while (line != null) {

                String[] attributes = line.split(",");
                if (attributes[0].contains("Group")) {

                    Group group = createGroup(attributes);

                    groups.add(group);
                }

                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return groups;
    }
    
}
