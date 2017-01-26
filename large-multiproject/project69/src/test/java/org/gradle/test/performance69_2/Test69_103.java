package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_103 {
    private final Production69_103 production = new Production69_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}