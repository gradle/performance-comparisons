package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_359 {
    private final Production70_359 production = new Production70_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}