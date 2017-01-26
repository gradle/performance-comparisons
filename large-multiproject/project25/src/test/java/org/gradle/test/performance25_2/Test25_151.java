package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_151 {
    private final Production25_151 production = new Production25_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}