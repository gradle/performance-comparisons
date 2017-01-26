package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_399 {
    private final Production69_399 production = new Production69_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}