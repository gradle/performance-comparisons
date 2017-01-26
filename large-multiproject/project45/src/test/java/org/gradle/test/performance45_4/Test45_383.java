package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_383 {
    private final Production45_383 production = new Production45_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}