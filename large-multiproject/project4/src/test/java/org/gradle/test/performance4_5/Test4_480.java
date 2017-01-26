package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_480 {
    private final Production4_480 production = new Production4_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}