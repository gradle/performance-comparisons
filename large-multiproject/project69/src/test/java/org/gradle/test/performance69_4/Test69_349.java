package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_349 {
    private final Production69_349 production = new Production69_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}