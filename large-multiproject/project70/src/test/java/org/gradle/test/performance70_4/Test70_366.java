package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_366 {
    private final Production70_366 production = new Production70_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}