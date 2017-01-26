package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_411 {
    private final Production65_411 production = new Production65_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}