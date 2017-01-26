package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_311 {
    private final Production4_311 production = new Production4_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}