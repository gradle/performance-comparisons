package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_8 {
    private final Production48_8 production = new Production48_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}