package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_483 {
    private final Production69_483 production = new Production69_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}