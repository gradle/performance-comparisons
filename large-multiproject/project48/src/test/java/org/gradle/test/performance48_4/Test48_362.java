package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_362 {
    private final Production48_362 production = new Production48_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}