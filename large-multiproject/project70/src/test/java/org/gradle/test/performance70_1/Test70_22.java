package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_22 {
    private final Production70_22 production = new Production70_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}