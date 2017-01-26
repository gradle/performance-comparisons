package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_436 {
    private final Production70_436 production = new Production70_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}