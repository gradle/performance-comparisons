package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_454 {
    private final Production9_454 production = new Production9_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}