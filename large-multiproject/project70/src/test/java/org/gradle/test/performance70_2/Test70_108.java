package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_108 {
    private final Production70_108 production = new Production70_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}