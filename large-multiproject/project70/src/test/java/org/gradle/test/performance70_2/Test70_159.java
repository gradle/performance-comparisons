package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_159 {
    private final Production70_159 production = new Production70_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}