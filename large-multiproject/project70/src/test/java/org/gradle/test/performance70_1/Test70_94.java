package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_94 {
    private final Production70_94 production = new Production70_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}