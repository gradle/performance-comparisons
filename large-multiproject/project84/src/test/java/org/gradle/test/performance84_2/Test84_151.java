package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_151 {
    private final Production84_151 production = new Production84_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}