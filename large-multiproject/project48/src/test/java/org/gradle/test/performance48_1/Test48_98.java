package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_98 {
    private final Production48_98 production = new Production48_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}