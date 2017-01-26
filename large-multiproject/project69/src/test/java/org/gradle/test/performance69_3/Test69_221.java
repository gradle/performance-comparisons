package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_221 {
    private final Production69_221 production = new Production69_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}