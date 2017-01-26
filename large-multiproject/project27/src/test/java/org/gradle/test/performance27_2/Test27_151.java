package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_151 {
    private final Production27_151 production = new Production27_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}