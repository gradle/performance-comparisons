package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_11 {
    private final Production70_11 production = new Production70_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}