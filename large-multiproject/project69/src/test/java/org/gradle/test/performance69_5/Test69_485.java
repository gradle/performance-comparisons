package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_485 {
    private final Production69_485 production = new Production69_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}