package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_454 {
    private final Production14_454 production = new Production14_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}