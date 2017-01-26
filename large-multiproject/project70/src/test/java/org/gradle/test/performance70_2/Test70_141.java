package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_141 {
    private final Production70_141 production = new Production70_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}