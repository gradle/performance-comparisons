package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_411 {
    private final Production68_411 production = new Production68_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}