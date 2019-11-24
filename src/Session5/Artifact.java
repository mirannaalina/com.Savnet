package Session5;



import java.time.LocalDate;

    public class Artifact implements Comparable<Artifact>{

    @Override
    public int compareTo(Artifact o) {
        return -discoveryData.compareTo(o.getDiscoveryData());
    }

    enum ArtifactType{
       VASE,
       JEWELRY,
       PARTIALRELIC,
       UNKNOWN
   }

   enum Condition{
       POOR,
       MEDIOCRE,
       GOOD,
       NEEDSPECIALHANDLING
   }

    private ArtifactType artifactType;
    private Condition condition;
    private LocalDate discoveryData;
    private int estimatedDateOfOrigin;


    public Artifact(ArtifactType artifactType, Condition condition, LocalDate discoveryData, int estimatedDateOfOrigin) {
        this.artifactType =artifactType;
        this.condition = condition;
        this.discoveryData = discoveryData;
        this.estimatedDateOfOrigin = estimatedDateOfOrigin;
    }

    public ArtifactType getArtifactType() {
        return artifactType;
    }

    public Condition getCondition() {
        return condition;
    }

    public LocalDate getDiscoveryData() {
        return discoveryData;
    }

    public int getEstimatedDateOfOrigin() {
        return estimatedDateOfOrigin;
    }



    @Override
    public String toString() {
        return "Artifact{" +
                "artifactType=" + artifactType +
                ", condition=" + condition +
                ", discoveryData=" + discoveryData +
                ", estimatedDateOfOrigin=" + estimatedDateOfOrigin +
                '}';
    }
}
