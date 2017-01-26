package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_294 {
    private final Production48_294 production = new Production48_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}