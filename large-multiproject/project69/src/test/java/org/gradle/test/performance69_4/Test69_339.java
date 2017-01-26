package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_339 {
    private final Production69_339 production = new Production69_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}