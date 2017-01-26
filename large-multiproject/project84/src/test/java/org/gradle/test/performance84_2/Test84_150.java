package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_150 {
    private final Production84_150 production = new Production84_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}