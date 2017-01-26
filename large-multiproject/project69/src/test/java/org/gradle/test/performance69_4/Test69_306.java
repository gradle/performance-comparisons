package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_306 {
    private final Production69_306 production = new Production69_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}