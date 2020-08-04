package Logic;

import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MessageHandler {

    private VBox messageContainer;
    private static MessageHandler instance;

    private MessageHandler() { }

    public synchronized static MessageHandler getInstance() {
        if (instance == null) {
            instance = new MessageHandler();
        }
        return instance;
    }

    public void setMessageContainer(VBox container) {
        this.messageContainer = container;
    }

    public void add(String text, MessageType type) {
        Label lbl = new Label(text);
        lbl.getStyleClass().add("msg-text");

        switch (type) {
            case INFO -> lbl.getStyleClass().add("info-text");
            case WARNING -> lbl.getStyleClass().add("warning-text");
            case ERROR -> lbl.getStyleClass().add("error-text");
        }

        Platform.runLater(() -> this.messageContainer.getChildren().add(lbl));
    }

    public void clear() {
        Platform.runLater(() -> this.messageContainer.getChildren().clear());
    }
}
