package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_13 {
    private final Production4_13 production = new Production4_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}