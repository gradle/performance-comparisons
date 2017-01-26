package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_262 {
    private final Production70_262 production = new Production70_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}