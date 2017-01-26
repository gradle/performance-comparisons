package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_151 {
    private final Production30_151 production = new Production30_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}