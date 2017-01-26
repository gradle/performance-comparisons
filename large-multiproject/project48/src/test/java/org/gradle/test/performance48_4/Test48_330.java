package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_330 {
    private final Production48_330 production = new Production48_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}