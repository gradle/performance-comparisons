package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_421 {
    private final Production84_421 production = new Production84_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}