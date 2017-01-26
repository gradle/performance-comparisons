package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_129 {
    private final Production70_129 production = new Production70_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}