package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_411 {
    private final Production49_411 production = new Production49_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}