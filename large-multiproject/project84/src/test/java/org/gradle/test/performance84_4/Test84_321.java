package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_321 {
    private final Production84_321 production = new Production84_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}