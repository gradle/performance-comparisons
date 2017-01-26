package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_26 {
    private final Production48_26 production = new Production48_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}