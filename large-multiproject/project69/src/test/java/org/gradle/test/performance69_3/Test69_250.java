package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_250 {
    private final Production69_250 production = new Production69_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}