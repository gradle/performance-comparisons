package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_284 {
    private final Production70_284 production = new Production70_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}