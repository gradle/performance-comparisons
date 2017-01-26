package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_141 {
    private final Production45_141 production = new Production45_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}