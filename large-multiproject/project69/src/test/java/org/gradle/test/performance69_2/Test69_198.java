package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_198 {
    private final Production69_198 production = new Production69_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}