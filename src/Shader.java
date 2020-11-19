public class Shader extends ShaderProgram{

    public Shader(String vertex_file, String fragment_file) {
        super(vertex_file, fragment_file);
    }

    @Override
    protected void bindAttributes() {
        super.bindAttribute(0, "position");
    }

}