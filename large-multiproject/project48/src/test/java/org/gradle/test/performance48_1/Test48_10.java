package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_10 {
    private final Production48_10 production = new Production48_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}