package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_409 {
    private final Production70_409 production = new Production70_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}