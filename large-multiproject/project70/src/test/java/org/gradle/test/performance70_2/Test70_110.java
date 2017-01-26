package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_110 {
    private final Production70_110 production = new Production70_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}