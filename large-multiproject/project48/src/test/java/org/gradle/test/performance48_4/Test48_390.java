package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_390 {
    private final Production48_390 production = new Production48_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}