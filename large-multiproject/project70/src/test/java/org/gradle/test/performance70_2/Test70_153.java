package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_153 {
    private final Production70_153 production = new Production70_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}