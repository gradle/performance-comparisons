package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_411 {
    private final Production18_411 production = new Production18_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}