package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_493 {
    private final Production70_493 production = new Production70_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}