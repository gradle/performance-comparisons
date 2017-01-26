package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_341 {
    private final Production69_341 production = new Production69_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}