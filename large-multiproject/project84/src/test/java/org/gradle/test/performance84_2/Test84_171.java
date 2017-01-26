package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_171 {
    private final Production84_171 production = new Production84_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}