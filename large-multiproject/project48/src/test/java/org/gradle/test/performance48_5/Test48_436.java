package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_436 {
    private final Production48_436 production = new Production48_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}