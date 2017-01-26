package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_48 {
    private final Production48_48 production = new Production48_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}