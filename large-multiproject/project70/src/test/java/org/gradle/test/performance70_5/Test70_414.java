package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_414 {
    private final Production70_414 production = new Production70_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}