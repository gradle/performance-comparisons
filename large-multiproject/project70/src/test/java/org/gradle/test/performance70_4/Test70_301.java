package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_301 {
    private final Production70_301 production = new Production70_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}