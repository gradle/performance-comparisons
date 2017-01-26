package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_287 {
    private final Production4_287 production = new Production4_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}