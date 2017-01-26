package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_459 {
    private final Production70_459 production = new Production70_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}