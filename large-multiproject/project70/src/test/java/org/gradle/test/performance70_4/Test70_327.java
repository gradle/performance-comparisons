package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_327 {
    private final Production70_327 production = new Production70_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}