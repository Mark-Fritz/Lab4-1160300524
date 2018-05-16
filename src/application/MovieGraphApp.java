package application;

import Exception.*;
import Exception.Edge.DirectedEdgeException;
import Exception.Edge.EdgeTypeException;
import Exception.Edge.EdgeVertexException;
import Exception.Edge.UndirectedEdgeException;
import Exception.Vertex.VertexAttributeException;
import Exception.Vertex.VertexTypeException;
import helper.ParseCommandHelper;

import java.io.IOException;

class MovieGraphApp {

    public static void main(String[] args) throws IOException, EdgeVertexException, VertexAttributeException, TypeException, FormatException, VertexTypeException, EdgeTypeException, UndirectedEdgeException, DirectedEdgeException {
        new MovieGraphApp("test/graph/data/GraphMovie.txt");
    }

    MovieGraphApp(String filePath) throws IOException, EdgeVertexException, VertexAttributeException, TypeException, FormatException, VertexTypeException, EdgeTypeException, UndirectedEdgeException, DirectedEdgeException {
        ParseCommandHelper.Command(filePath);
    }
}
