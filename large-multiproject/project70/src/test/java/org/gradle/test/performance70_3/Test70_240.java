package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_240 {
    private final Production70_240 production = new Production70_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}