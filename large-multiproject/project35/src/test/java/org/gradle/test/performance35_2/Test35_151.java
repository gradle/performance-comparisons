package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_151 {
    private final Production35_151 production = new Production35_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}