package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_39 {
    private final Production48_39 production = new Production48_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}