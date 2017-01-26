package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_151 {
    private final Production20_151 production = new Production20_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}