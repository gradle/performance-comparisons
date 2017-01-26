package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_24 {
    private final Production4_24 production = new Production4_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}