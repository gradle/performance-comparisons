package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_492 {
    private final Production84_492 production = new Production84_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}