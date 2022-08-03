package com.kodilla.spring.intro.shape;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawerTestSuite {

    @DisplayName("Test with drawing a Circle")
    @Test
    void testDoDrawingWithCircle() {
        Circle circle = new Circle();

        Drawer drawer = new Drawer(circle);
        String result = drawer.doDrawing();

        assertEquals("This is a Circle", result);
    }

    @DisplayName("Test with drawing a Triangle")
    @Test
    void testDoDrawingWithTriangle() {
        Triangle triangle = new Triangle();

        Drawer drawer = new Drawer(triangle);
        String resul = drawer.doDrawing();

        assertEquals("This is a triangle", resul);
    }
}