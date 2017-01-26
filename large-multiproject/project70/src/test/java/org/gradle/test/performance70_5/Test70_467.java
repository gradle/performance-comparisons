package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_467 {
    private final Production70_467 production = new Production70_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}