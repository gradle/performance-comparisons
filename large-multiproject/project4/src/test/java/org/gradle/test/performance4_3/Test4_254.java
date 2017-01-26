package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_254 {
    private final Production4_254 production = new Production4_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}