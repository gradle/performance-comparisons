package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_194 {
    private final Production70_194 production = new Production70_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}