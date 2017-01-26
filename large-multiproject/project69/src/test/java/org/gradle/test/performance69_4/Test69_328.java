package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_328 {
    private final Production69_328 production = new Production69_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}