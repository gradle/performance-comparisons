package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_5 {
    private final Production48_5 production = new Production48_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}