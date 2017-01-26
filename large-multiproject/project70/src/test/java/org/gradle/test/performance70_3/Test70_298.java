package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_298 {
    private final Production70_298 production = new Production70_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}