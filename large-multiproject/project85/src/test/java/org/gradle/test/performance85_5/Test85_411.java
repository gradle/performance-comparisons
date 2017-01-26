package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_411 {
    private final Production85_411 production = new Production85_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}