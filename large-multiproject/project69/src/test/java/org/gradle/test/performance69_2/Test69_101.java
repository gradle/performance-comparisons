package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_101 {
    private final Production69_101 production = new Production69_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}