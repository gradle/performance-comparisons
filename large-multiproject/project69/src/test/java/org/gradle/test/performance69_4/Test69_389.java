package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_389 {
    private final Production69_389 production = new Production69_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}