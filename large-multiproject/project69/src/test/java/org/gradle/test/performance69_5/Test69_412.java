package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_412 {
    private final Production69_412 production = new Production69_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}