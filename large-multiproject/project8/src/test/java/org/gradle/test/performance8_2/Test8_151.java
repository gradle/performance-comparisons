package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_151 {
    private final Production8_151 production = new Production8_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}