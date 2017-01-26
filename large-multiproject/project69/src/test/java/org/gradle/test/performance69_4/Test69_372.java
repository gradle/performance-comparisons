package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_372 {
    private final Production69_372 production = new Production69_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}