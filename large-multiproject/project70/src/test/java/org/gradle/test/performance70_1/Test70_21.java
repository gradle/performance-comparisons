package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_21 {
    private final Production70_21 production = new Production70_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}