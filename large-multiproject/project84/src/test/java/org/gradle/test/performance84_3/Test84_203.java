package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_203 {
    private final Production84_203 production = new Production84_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}