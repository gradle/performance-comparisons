package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_429 {
    private final Production4_429 production = new Production4_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}