package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_387 {
    private final Production69_387 production = new Production69_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}