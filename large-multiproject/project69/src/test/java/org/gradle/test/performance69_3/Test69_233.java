package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_233 {
    private final Production69_233 production = new Production69_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}