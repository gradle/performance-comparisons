package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_471 {
    private final Production48_471 production = new Production48_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}