package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_376 {
    private final Production70_376 production = new Production70_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}