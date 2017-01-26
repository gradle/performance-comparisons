package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_50 {
    private final Production70_50 production = new Production70_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}