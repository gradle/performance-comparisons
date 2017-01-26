package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_456 {
    private final Production70_456 production = new Production70_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}