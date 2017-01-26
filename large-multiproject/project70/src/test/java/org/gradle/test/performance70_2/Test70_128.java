package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_128 {
    private final Production70_128 production = new Production70_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}