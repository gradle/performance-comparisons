package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_202 {
    private final Production48_202 production = new Production48_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}