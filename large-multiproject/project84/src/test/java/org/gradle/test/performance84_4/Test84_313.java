package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_313 {
    private final Production84_313 production = new Production84_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}