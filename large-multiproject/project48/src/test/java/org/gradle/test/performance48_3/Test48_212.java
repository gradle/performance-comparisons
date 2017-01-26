package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_212 {
    private final Production48_212 production = new Production48_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}