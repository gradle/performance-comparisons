package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_20 {
    private final Production70_20 production = new Production70_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}