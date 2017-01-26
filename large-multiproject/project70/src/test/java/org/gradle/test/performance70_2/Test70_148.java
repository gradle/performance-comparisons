package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_148 {
    private final Production70_148 production = new Production70_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}