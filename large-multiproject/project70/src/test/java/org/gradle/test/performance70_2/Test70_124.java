package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_124 {
    private final Production70_124 production = new Production70_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}