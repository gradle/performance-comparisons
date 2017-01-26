package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_382 {
    private final Production48_382 production = new Production48_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}