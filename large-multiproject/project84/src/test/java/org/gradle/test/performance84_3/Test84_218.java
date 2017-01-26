package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_218 {
    private final Production84_218 production = new Production84_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}