package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_117 {
    private final Production45_117 production = new Production45_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}