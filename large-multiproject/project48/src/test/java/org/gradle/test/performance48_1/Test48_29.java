package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_29 {
    private final Production48_29 production = new Production48_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}