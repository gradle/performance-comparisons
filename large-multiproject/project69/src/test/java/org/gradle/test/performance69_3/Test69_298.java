package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_298 {
    private final Production69_298 production = new Production69_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}