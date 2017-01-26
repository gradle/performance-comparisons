package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_211 {
    private final Production70_211 production = new Production70_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}