package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_36 {
    private final Production48_36 production = new Production48_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}