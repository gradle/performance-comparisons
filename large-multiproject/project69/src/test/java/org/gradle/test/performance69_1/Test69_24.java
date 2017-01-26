package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_24 {
    private final Production69_24 production = new Production69_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}