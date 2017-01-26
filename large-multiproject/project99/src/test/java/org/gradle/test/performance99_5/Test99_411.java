package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_411 {
    private final Production99_411 production = new Production99_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}