package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_441 {
    private final Production48_441 production = new Production48_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}