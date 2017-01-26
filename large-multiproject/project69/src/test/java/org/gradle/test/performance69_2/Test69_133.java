package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_133 {
    private final Production69_133 production = new Production69_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}