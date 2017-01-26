package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_481 {
    private final Production48_481 production = new Production48_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}