package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_125 {
    private final Production69_125 production = new Production69_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}