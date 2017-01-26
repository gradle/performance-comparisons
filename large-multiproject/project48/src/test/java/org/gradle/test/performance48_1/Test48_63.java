package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_63 {
    private final Production48_63 production = new Production48_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}