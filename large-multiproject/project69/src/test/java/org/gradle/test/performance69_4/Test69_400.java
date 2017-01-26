package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_400 {
    private final Production69_400 production = new Production69_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}