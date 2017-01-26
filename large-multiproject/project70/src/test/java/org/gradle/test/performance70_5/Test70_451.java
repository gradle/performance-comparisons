package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_451 {
    private final Production70_451 production = new Production70_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}