package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_467 {
    private final Production69_467 production = new Production69_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}