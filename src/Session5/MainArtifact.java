package Session5;

import java.time.LocalDate;
import java.util.*;

import static Session5.Artifact.ArtifactType.*;
import static Session5.Artifact.Condition.*;

public class MainArtifact {
    public static void main(String[] args) {

        List<Artifact> artifactList =  new ArrayList<>();


        artifactList.add(new GreekArtifact(VASE, POOR,LocalDate.of(1987,01,01) , 2000, "Iohan"));
        artifactList.add(new GreekArtifact(JEWELRY, MEDIOCRE,LocalDate.of(1990,07,01), 1000, "Irod"));
        artifactList.add(new GreekArtifact(PARTIALRELIC, MEDIOCRE,LocalDate.of(1000,02,01) , 2000, "Cristos"));
        artifactList.add(new GreekArtifact(PARTIALRELIC, POOR,LocalDate.of(1990,03,01) , 1987, "Jes"));
        artifactList.add(new GreekArtifact(UNKNOWN, GOOD,LocalDate.of(1990,07,02) , 1999, "Cos"));
        artifactList.add(new GreekArtifact(PARTIALRELIC, NEEDSPECIALHANDLING,LocalDate.of(1567,07,01) , 1000, "Moros"));


        List<Artifact> artifactList2 =  new ArrayList<>();


        artifactList.add(new GreekArtifact(VASE, POOR,LocalDate.of(1999,01,01) , 2000, "Ioji"));
        artifactList.add(new GreekArtifact(JEWELRY, MEDIOCRE,LocalDate.of(1000,07,01), 1000, "Gods"));


        Collections.sort(artifactList); //crescator
        System.out.println(artifactList);

        Map<String,List> museumap = new HashMap<>();

        museumap.put("Washington",artifactList);
        museumap.put("Colon",artifactList2);

    }
}
