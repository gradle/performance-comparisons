package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_411 {
    private final Production81_411 production = new Production81_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}