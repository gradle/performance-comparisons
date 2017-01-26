package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_482 {
    private final Production48_482 production = new Production48_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}