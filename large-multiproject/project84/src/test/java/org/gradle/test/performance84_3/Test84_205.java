package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_205 {
    private final Production84_205 production = new Production84_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}