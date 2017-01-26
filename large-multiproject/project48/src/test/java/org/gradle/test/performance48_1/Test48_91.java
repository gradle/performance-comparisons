package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_91 {
    private final Production48_91 production = new Production48_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}