package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_121 {
    private final Production70_121 production = new Production70_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}