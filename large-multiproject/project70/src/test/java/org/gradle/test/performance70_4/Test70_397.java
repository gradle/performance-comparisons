package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_397 {
    private final Production70_397 production = new Production70_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}