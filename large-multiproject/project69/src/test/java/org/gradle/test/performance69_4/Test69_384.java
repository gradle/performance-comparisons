package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_384 {
    private final Production69_384 production = new Production69_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}