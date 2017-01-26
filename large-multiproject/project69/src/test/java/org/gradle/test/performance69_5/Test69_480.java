package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_480 {
    private final Production69_480 production = new Production69_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}