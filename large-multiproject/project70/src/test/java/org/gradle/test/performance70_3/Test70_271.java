package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_271 {
    private final Production70_271 production = new Production70_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}