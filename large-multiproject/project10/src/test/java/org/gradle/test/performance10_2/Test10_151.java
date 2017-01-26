package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_151 {
    private final Production10_151 production = new Production10_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}