package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_280 {
    private final Production69_280 production = new Production69_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}