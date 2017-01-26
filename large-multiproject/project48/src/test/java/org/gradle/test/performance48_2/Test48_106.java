package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_106 {
    private final Production48_106 production = new Production48_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}