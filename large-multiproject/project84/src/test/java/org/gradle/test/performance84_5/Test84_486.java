package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_486 {
    private final Production84_486 production = new Production84_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}