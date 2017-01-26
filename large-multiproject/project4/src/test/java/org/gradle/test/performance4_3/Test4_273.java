package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_273 {
    private final Production4_273 production = new Production4_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}