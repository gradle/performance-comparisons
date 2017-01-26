package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_169 {
    private final Production69_169 production = new Production69_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}