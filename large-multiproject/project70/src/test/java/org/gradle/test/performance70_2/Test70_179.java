package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_179 {
    private final Production70_179 production = new Production70_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}