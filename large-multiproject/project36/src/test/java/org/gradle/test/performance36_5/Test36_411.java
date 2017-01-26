package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_411 {
    private final Production36_411 production = new Production36_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}