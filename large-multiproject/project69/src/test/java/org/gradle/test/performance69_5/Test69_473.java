package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_473 {
    private final Production69_473 production = new Production69_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}