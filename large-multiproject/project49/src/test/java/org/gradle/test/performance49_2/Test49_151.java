package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_151 {
    private final Production49_151 production = new Production49_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}