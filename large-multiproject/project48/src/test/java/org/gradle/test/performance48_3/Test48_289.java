package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_289 {
    private final Production48_289 production = new Production48_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}