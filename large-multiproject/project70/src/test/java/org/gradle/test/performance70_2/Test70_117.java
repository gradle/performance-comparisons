package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_117 {
    private final Production70_117 production = new Production70_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}