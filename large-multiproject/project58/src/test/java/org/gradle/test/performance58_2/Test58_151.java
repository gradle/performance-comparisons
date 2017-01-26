package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_151 {
    private final Production58_151 production = new Production58_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}