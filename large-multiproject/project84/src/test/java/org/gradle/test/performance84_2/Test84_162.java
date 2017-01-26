package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_162 {
    private final Production84_162 production = new Production84_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}