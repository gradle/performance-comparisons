package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_248 {
    private final Production70_248 production = new Production70_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}