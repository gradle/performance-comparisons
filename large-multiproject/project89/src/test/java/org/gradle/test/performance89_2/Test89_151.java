package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_151 {
    private final Production89_151 production = new Production89_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}