package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_151 {
    private final Production24_151 production = new Production24_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}