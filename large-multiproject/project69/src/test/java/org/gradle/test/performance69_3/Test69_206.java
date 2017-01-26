package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_206 {
    private final Production69_206 production = new Production69_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}