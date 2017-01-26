package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_474 {
    private final Production48_474 production = new Production48_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}