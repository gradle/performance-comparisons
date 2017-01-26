package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_438 {
    private final Production70_438 production = new Production70_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}