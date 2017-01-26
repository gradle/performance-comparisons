package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_304 {
    private final Production48_304 production = new Production48_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}