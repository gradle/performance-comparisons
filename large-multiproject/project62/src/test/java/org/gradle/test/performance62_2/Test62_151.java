package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_151 {
    private final Production62_151 production = new Production62_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}