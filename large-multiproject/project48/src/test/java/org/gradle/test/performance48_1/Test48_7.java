package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_7 {
    private final Production48_7 production = new Production48_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}