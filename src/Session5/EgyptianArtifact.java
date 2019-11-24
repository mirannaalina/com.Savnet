package Session5;

import java.time.LocalDate;

public class EgyptianArtifact extends Artifact {

    private String pharaon;


    @Override
    public ArtifactType getArtifactType() {
        return super.getArtifactType();
    }

    @Override
    public Condition getCondition() {
        return super.getCondition();
    }

    @Override
    public LocalDate getDiscoveryData() {
        return super.getDiscoveryData();
    }

    @Override
    public int getEstimatedDateOfOrigin() {
        return super.getEstimatedDateOfOrigin();
    }

    public EgyptianArtifact(ArtifactType artifactType, Condition condition, LocalDate discoveryData, int estimatedDateOfOrigin, String pharaon) {
        super(artifactType, condition, discoveryData, estimatedDateOfOrigin);
        this.pharaon = pharaon;
    }

    public String getPharaon() {
        return pharaon;
    }

    @Override
    public String toString() {
        return "EgyptianArtifact{" +
                "pharaon='" + pharaon + '\'' +super.toString();

    }
}
