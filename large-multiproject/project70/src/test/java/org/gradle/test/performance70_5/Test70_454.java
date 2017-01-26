package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_454 {
    private final Production70_454 production = new Production70_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}