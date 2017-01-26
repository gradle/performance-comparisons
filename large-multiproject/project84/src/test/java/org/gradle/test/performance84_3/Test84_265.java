package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_265 {
    private final Production84_265 production = new Production84_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}