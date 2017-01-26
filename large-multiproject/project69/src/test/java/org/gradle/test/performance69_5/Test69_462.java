package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_462 {
    private final Production69_462 production = new Production69_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}