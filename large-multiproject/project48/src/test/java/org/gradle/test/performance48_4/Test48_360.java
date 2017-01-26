package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_360 {
    private final Production48_360 production = new Production48_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}