package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_368 {
    private final Production70_368 production = new Production70_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}