package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_391 {
    private final Production70_391 production = new Production70_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}