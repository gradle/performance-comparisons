package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_151 {
    private final Production93_151 production = new Production93_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}