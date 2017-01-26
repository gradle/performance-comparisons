package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_389 {
    private final Production4_389 production = new Production4_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}