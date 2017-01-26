package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_229 {
    private final Production48_229 production = new Production48_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}