package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_14 {
    private final Production48_14 production = new Production48_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}