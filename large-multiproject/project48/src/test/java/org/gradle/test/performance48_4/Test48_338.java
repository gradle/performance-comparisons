package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_338 {
    private final Production48_338 production = new Production48_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}