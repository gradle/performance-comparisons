package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_151 {
    private final Production37_151 production = new Production37_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}