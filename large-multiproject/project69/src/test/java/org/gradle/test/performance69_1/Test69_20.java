package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_20 {
    private final Production69_20 production = new Production69_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}