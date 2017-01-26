package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_56 {
    private final Production84_56 production = new Production84_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}