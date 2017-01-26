package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_232 {
    private final Production4_232 production = new Production4_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}