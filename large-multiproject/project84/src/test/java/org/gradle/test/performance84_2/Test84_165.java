package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_165 {
    private final Production84_165 production = new Production84_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}