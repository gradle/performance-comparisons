package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_317 {
    private final Production84_317 production = new Production84_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}