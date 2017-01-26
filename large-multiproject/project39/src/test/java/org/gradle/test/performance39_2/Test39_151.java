package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_151 {
    private final Production39_151 production = new Production39_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}