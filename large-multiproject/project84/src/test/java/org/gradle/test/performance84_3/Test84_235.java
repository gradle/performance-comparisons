package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_235 {
    private final Production84_235 production = new Production84_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}