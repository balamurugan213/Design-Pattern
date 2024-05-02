package State;

public class Canvas_o {
    private ToolType_o currentTool;

    public void mouseDown(){
        if(currentTool== ToolType_o.SELECTION){
            System.out.println("Selection Icon");
        } else if (currentTool== ToolType_o.BRUSH) {
            System.out.println("Brush Icon");
        } else if(currentTool== ToolType_o.ERASER){
            System.out.println("Eraser Icon");

        }
    }
    public void mouseUp(){
        if(currentTool== ToolType_o.SELECTION){
            System.out.println("Draw Dashed Rectangle");
        } else if (currentTool== ToolType_o.BRUSH) {
            System.out.println("Draw Line");
        } else if(currentTool== ToolType_o.ERASER){
            System.out.println("Eraser Something");

        }
    }

    public ToolType_o getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(ToolType_o currentTool) {
        this.currentTool = currentTool;
    }
}
