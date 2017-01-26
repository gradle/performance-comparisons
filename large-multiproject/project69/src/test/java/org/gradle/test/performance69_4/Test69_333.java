package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_333 {
    private final Production69_333 production = new Production69_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}