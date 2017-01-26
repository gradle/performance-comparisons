package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_115 {
    private final Production69_115 production = new Production69_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}