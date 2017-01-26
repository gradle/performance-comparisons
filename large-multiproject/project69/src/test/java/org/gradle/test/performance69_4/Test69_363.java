package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_363 {
    private final Production69_363 production = new Production69_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}