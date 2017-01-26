package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_280 {
    private final Production4_280 production = new Production4_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}