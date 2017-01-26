package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_31 {
    private final Production48_31 production = new Production48_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}