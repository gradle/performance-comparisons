package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_151 {
    private final Production18_151 production = new Production18_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}