package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_370 {
    private final Production69_370 production = new Production69_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}