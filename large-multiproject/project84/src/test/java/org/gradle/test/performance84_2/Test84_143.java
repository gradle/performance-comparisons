package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_143 {
    private final Production84_143 production = new Production84_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}