package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_411 {
    private final Production90_411 production = new Production90_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}