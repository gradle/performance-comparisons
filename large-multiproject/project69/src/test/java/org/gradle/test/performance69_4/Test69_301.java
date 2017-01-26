package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_301 {
    private final Production69_301 production = new Production69_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}