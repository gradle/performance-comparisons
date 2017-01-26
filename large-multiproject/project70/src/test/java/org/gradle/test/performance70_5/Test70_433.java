package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_433 {
    private final Production70_433 production = new Production70_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}