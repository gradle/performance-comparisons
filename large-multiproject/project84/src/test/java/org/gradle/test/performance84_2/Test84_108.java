package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_108 {
    private final Production84_108 production = new Production84_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}