package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_303 {
    private final Production48_303 production = new Production48_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}