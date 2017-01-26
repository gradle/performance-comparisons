package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_131 {
    private final Production84_131 production = new Production84_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}