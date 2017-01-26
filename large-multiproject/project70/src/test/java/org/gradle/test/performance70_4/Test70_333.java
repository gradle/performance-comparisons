package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_333 {
    private final Production70_333 production = new Production70_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}