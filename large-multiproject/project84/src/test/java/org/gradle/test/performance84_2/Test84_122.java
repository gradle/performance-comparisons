package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_122 {
    private final Production84_122 production = new Production84_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}