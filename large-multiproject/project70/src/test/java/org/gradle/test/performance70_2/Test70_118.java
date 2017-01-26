package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_118 {
    private final Production70_118 production = new Production70_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}