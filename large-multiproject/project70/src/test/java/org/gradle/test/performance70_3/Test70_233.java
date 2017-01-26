package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_233 {
    private final Production70_233 production = new Production70_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}