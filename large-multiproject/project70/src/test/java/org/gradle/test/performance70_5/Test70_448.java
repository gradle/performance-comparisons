package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_448 {
    private final Production70_448 production = new Production70_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}