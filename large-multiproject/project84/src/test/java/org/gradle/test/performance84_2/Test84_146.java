package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_146 {
    private final Production84_146 production = new Production84_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}