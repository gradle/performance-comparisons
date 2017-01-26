package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_453 {
    private final Production70_453 production = new Production70_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}