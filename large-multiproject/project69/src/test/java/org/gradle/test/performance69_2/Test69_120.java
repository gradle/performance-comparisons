package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_120 {
    private final Production69_120 production = new Production69_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}