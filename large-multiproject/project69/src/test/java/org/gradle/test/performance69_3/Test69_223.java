package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_223 {
    private final Production69_223 production = new Production69_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}