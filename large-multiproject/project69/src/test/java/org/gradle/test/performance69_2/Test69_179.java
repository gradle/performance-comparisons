package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_179 {
    private final Production69_179 production = new Production69_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}