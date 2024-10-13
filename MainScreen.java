package Presentation;

import Data.Photo;
import Data.PhotoRepository;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;

public class MainScreen extends VBox {
    int photoNumber = 0;
    PhotoRepository photoRepository = new PhotoRepository();
    List<Photo> myPhotos = photoRepository.getAllPhotos();

    Image image;
    ImageView imageView;

    public MainScreen() {
        try {
            // İlk fotoğrafı yükle ve hata varsa mesaj göster
            String imageUrl = myPhotos.get(photoNumber).url;
            System.out.println("Fotoğraf Yolu: " + imageUrl);  // Fotoğraf yolunu yazdırma
            image = new Image(imageUrl, true); // Background yükleme ile Image nesnesi oluşturuluyor
            if (image.isError()) {
                System.err.println("Fotoğraf yüklenemedi: " + imageUrl);
            }
            imageView = new ImageView(image);

            // ImageView ayarları
            imageView.setFitWidth(400);
            imageView.setPreserveRatio(true);

            // Fotoğraf değiştirme butonu
            Button button = new Button("Show Next Photo");
            button.setOnAction(e -> {
                photoNumber = (photoNumber + 1) % myPhotos.size();
                String nextImageUrl = myPhotos.get(photoNumber).url;
                System.out.println("Yeni Fotoğraf Yolu: " + nextImageUrl);
                imageView.setImage(new Image(nextImageUrl, true));  // Fotoğrafı güncelle
                if (imageView.getImage().isError()) {
                    System.err.println("Fotoğraf yüklenemedi: " + nextImageUrl);
                }
            });

            // Layout ayarları (VBox içine yerleştirme)
            this.getChildren().addAll(imageView, button);

        } catch (Exception e) {
            System.err.println("Error loading the photo: " + e.getMessage());
        }
    }

    public Scene getScene(int width, int height) {
        return new Scene(this, 800, 600);  // Sahneyi MainScreen üzerinden oluşturuyoruz
    }
}
