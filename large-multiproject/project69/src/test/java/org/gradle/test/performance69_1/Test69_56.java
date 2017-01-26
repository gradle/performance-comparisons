package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_56 {
    private final Production69_56 production = new Production69_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}