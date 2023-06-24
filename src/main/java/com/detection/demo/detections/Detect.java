import ai.djl.modality.cv.Image;
import ai.djl.modality.cv.ImageFactory;
import ai.djl.modality.cv.ImageVisualization;
import ai.djl.modality.cv.output.DetectedObjects;
import ai.djl.modality.cv.util.NDImageUtils;
import ai.djl.mxnet.zoo.MxModelZoo;
import ai.djl.repository.zoo.ZooModel;
import ai.djl.training.util.DownloadUtils;

public class Detect {
    public static load_model()
    {
        var criteria = Criteria.builder()
            .setTypes(Image.class, DetectedObjects.class)
            .optArtifactId("ssd")
            .optProgress(new ProgressBar())
            .build();
        var model = criteria.loadModel();

        return model;
    }

    public static predict()
    {
        var img = ImageFactory.getInstance().fromUrl("https://resources.djl.ai/images/dog_bike_car.jpg");
        img.getWrappedImage();
        model = Detect.load_model();
        var detections = model.newPredictor().predict(img);

        return detections;

    }
}
