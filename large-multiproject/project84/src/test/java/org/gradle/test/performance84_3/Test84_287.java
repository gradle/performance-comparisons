package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_287 {
    private final Production84_287 production = new Production84_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}