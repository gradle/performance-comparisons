package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_116 {
    private final Production70_116 production = new Production70_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}