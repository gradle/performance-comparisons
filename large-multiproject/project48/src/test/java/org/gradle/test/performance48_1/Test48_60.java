package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_60 {
    private final Production48_60 production = new Production48_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}