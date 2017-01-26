package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_220 {
    private final Production48_220 production = new Production48_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}