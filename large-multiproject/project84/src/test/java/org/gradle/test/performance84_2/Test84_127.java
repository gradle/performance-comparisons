package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_127 {
    private final Production84_127 production = new Production84_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}