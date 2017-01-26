package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_497 {
    private final Production48_497 production = new Production48_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}