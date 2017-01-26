package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_144 {
    private final Production70_144 production = new Production70_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}