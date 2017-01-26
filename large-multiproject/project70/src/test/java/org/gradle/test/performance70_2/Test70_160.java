package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_160 {
    private final Production70_160 production = new Production70_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}