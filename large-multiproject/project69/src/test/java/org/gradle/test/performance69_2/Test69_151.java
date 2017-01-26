package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_151 {
    private final Production69_151 production = new Production69_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}