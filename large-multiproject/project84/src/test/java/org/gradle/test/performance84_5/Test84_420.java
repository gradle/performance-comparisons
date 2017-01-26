package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_420 {
    private final Production84_420 production = new Production84_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}