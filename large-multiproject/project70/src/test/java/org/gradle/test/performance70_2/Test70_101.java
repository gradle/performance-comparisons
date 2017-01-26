package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_101 {
    private final Production70_101 production = new Production70_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}