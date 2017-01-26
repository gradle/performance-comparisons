package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_365 {
    private final Production48_365 production = new Production48_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}