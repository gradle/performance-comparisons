package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_375 {
    private final Production4_375 production = new Production4_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}