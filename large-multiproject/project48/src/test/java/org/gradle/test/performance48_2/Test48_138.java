package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_138 {
    private final Production48_138 production = new Production48_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}