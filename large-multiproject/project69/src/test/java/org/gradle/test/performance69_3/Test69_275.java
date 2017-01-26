package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_275 {
    private final Production69_275 production = new Production69_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}