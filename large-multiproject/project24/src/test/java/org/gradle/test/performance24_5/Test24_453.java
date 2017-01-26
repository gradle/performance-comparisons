package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_453 {
    private final Production24_453 production = new Production24_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}