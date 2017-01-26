package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_303 {
    private final Production84_303 production = new Production84_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}