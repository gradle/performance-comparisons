package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_25 {
    private final Production48_25 production = new Production48_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}