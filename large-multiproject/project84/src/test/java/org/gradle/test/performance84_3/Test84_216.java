package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_216 {
    private final Production84_216 production = new Production84_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}