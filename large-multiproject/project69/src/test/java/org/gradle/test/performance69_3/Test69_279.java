package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_279 {
    private final Production69_279 production = new Production69_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}