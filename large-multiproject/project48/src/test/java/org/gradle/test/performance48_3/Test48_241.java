package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_241 {
    private final Production48_241 production = new Production48_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}