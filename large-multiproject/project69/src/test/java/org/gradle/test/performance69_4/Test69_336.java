package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_336 {
    private final Production69_336 production = new Production69_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}