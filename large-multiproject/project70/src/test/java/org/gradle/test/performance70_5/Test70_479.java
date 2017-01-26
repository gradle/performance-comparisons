package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_479 {
    private final Production70_479 production = new Production70_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}