package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_335 {
    private final Production70_335 production = new Production70_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}