package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_354 {
    private final Production69_354 production = new Production69_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}