package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_273 {
    private final Production92_273 production = new Production92_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}