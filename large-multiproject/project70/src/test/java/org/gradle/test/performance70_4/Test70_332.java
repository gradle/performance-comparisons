package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_332 {
    private final Production70_332 production = new Production70_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}