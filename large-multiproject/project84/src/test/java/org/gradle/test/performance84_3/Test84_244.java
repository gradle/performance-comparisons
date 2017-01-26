package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_244 {
    private final Production84_244 production = new Production84_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}