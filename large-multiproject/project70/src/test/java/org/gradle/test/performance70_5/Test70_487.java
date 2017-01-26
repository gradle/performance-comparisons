package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_487 {
    private final Production70_487 production = new Production70_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}