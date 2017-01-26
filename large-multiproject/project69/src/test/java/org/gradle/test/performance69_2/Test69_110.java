package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_110 {
    private final Production69_110 production = new Production69_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}