package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_441 {
    private final Production84_441 production = new Production84_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}