package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_151 {
    private final Production50_151 production = new Production50_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}