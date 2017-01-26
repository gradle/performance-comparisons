package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_28 {
    private final Production48_28 production = new Production48_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}