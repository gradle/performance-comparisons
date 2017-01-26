package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_403 {
    private final Production69_403 production = new Production69_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}