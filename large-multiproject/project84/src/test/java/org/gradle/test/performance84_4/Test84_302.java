package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_302 {
    private final Production84_302 production = new Production84_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}