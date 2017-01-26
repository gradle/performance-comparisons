package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_304 {
    private final Production84_304 production = new Production84_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}