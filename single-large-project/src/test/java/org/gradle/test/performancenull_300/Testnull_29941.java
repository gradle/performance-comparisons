package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29941 {
    private final Productionnull_29941 production = new Productionnull_29941("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}