package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_472 {
    private final Production70_472 production = new Production70_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}