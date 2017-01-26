package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_122 {
    private final Production69_122 production = new Production69_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}