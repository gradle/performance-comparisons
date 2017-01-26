package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_411 {
    private final Production62_411 production = new Production62_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}