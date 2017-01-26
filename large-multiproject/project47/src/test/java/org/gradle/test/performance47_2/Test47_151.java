package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_151 {
    private final Production47_151 production = new Production47_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}