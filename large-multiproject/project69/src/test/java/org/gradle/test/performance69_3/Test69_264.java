package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_264 {
    private final Production69_264 production = new Production69_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}