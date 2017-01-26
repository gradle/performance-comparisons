package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_418 {
    private final Production48_418 production = new Production48_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}