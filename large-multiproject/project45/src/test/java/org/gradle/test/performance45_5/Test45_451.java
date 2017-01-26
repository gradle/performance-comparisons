package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_451 {
    private final Production45_451 production = new Production45_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}