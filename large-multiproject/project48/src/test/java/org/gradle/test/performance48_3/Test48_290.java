package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_290 {
    private final Production48_290 production = new Production48_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}