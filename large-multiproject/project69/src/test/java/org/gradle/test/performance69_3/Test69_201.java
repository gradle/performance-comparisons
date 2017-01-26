package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_201 {
    private final Production69_201 production = new Production69_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}