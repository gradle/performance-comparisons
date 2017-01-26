package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_494 {
    private final Production70_494 production = new Production70_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}