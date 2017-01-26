package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_408 {
    private final Production70_408 production = new Production70_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}