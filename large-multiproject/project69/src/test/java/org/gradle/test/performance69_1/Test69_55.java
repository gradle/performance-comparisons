package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_55 {
    private final Production69_55 production = new Production69_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}