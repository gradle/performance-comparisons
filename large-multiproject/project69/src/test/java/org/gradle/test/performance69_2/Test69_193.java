package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_193 {
    private final Production69_193 production = new Production69_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}