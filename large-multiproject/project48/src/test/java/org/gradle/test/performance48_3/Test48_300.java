package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_300 {
    private final Production48_300 production = new Production48_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}