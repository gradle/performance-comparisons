package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_431 {
    private final Production84_431 production = new Production84_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}