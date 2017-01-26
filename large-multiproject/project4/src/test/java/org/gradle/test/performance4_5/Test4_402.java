package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_402 {
    private final Production4_402 production = new Production4_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}