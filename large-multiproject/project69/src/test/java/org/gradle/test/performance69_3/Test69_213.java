package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_213 {
    private final Production69_213 production = new Production69_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}