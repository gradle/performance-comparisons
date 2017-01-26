package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_185 {
    private final Production69_185 production = new Production69_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}