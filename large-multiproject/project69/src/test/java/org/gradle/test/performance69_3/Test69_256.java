package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_256 {
    private final Production69_256 production = new Production69_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}