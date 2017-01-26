package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_435 {
    private final Production48_435 production = new Production48_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}