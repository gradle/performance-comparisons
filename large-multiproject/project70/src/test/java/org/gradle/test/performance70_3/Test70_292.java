package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_292 {
    private final Production70_292 production = new Production70_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}