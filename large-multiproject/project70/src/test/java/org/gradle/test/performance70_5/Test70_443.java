package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_443 {
    private final Production70_443 production = new Production70_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}