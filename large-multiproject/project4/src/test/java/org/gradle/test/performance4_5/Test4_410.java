package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_410 {
    private final Production4_410 production = new Production4_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}