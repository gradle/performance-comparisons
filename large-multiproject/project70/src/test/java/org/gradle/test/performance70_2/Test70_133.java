package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_133 {
    private final Production70_133 production = new Production70_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}