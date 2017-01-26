package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_363 {
    private final Production84_363 production = new Production84_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}