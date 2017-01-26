package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_398 {
    private final Production69_398 production = new Production69_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}