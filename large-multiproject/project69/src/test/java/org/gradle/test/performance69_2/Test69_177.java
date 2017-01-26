package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_177 {
    private final Production69_177 production = new Production69_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}