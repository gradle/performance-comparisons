package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_23 {
    private final Production69_23 production = new Production69_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}