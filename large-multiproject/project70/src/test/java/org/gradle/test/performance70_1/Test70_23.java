package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_23 {
    private final Production70_23 production = new Production70_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}