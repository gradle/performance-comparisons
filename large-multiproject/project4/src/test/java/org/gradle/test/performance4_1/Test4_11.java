package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_11 {
    private final Production4_11 production = new Production4_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}