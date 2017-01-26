package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_140 {
    private final Production84_140 production = new Production84_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}