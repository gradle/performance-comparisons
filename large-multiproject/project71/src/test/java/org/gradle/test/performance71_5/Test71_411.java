package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_411 {
    private final Production71_411 production = new Production71_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}