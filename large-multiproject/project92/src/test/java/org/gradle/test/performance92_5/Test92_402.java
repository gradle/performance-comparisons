package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_402 {
    private final Production92_402 production = new Production92_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}