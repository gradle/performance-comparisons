package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_149 {
    private final Production69_149 production = new Production69_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}