package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_358 {
    private final Production48_358 production = new Production48_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}