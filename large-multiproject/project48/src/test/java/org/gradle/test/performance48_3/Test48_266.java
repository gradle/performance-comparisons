package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_266 {
    private final Production48_266 production = new Production48_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}