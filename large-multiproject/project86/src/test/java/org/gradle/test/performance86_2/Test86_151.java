package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_151 {
    private final Production86_151 production = new Production86_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}