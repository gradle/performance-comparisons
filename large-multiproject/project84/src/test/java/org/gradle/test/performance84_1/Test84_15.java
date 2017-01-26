package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_15 {
    private final Production84_15 production = new Production84_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}