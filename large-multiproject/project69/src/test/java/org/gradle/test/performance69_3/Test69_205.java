package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_205 {
    private final Production69_205 production = new Production69_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}