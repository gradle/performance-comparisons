package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_494 {
    private final Production85_494 production = new Production85_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}