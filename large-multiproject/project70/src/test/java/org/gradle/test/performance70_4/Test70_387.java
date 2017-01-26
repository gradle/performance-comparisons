package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_387 {
    private final Production70_387 production = new Production70_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}