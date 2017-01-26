package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_132 {
    private final Production70_132 production = new Production70_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}