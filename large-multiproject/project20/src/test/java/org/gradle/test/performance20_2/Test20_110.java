package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_110 {
    private final Production20_110 production = new Production20_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}