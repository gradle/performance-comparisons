package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_319 {
    private final Production70_319 production = new Production70_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}