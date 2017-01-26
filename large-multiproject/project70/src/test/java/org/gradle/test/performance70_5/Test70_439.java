package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_439 {
    private final Production70_439 production = new Production70_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}