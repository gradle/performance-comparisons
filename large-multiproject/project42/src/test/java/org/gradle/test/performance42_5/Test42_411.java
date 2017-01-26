package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_411 {
    private final Production42_411 production = new Production42_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}