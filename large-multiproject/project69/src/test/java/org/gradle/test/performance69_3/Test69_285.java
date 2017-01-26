package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_285 {
    private final Production69_285 production = new Production69_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}