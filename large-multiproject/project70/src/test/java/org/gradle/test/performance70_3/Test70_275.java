package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_275 {
    private final Production70_275 production = new Production70_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}