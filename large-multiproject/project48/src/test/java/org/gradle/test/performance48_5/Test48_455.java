package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_455 {
    private final Production48_455 production = new Production48_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}