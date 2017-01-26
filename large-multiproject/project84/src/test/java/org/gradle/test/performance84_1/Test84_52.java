package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_52 {
    private final Production84_52 production = new Production84_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}