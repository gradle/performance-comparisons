package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_201 {
    private final Production70_201 production = new Production70_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}