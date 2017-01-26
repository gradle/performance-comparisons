package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_483 {
    private final Production4_483 production = new Production4_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}