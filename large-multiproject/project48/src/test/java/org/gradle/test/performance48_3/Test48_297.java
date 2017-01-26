package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_297 {
    private final Production48_297 production = new Production48_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}