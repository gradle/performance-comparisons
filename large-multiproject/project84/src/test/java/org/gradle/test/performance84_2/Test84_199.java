package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_199 {
    private final Production84_199 production = new Production84_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}