package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_345 {
    private final Production84_345 production = new Production84_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}