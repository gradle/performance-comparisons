package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_402 {
    private final Production70_402 production = new Production70_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}