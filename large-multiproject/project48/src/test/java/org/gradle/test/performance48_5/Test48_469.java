package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_469 {
    private final Production48_469 production = new Production48_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}