package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_429 {
    private final Production92_429 production = new Production92_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}