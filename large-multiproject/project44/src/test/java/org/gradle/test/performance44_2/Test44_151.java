package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_151 {
    private final Production44_151 production = new Production44_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}