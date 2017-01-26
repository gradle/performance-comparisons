package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_113 {
    private final Production69_113 production = new Production69_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}