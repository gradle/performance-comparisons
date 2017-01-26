package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_184 {
    private final Production70_184 production = new Production70_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}