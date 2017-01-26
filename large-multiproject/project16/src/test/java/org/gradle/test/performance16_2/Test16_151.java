package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_151 {
    private final Production16_151 production = new Production16_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}