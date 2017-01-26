package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_320 {
    private final Production48_320 production = new Production48_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}