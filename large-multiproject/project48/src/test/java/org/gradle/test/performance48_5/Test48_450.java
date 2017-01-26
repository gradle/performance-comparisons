package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_450 {
    private final Production48_450 production = new Production48_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}