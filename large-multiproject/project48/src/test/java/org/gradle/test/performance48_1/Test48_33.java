package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_33 {
    private final Production48_33 production = new Production48_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}