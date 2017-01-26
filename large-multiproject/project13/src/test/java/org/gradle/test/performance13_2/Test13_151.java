package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_151 {
    private final Production13_151 production = new Production13_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}