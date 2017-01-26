package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_116 {
    private final Production69_116 production = new Production69_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}