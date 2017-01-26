package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_164 {
    private final Production84_164 production = new Production84_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}