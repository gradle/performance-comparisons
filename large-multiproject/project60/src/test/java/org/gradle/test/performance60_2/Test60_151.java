package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_151 {
    private final Production60_151 production = new Production60_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}