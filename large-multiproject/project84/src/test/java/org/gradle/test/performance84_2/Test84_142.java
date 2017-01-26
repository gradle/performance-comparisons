package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_142 {
    private final Production84_142 production = new Production84_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}