package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_283 {
    private final Production84_283 production = new Production84_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}