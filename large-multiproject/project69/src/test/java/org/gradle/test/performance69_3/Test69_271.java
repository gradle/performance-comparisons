package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_271 {
    private final Production69_271 production = new Production69_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}