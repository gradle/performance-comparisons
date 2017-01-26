package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_411 {
    private final Production2_411 production = new Production2_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}