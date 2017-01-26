package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_248 {
    private final Production69_248 production = new Production69_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}