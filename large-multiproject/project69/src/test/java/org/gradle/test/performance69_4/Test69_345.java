package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_345 {
    private final Production69_345 production = new Production69_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}