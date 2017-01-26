package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_197 {
    private final Production70_197 production = new Production70_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}