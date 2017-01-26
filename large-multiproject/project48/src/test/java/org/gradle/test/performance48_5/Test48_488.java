package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_488 {
    private final Production48_488 production = new Production48_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}