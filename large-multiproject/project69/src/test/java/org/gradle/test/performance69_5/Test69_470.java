package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_470 {
    private final Production69_470 production = new Production69_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}