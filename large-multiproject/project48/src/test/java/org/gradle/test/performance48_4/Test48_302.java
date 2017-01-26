package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_302 {
    private final Production48_302 production = new Production48_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}