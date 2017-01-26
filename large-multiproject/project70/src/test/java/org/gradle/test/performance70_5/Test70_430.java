package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_430 {
    private final Production70_430 production = new Production70_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}