package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_413 {
    private final Production70_413 production = new Production70_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}