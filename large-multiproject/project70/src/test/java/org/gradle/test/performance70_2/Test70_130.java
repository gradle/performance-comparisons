package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_130 {
    private final Production70_130 production = new Production70_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}