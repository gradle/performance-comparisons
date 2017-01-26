package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_411 {
    private final Production61_411 production = new Production61_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}