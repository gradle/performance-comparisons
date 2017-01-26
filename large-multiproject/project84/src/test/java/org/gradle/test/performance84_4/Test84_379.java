package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_379 {
    private final Production84_379 production = new Production84_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}