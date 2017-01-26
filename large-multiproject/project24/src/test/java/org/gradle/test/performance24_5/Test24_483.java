package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_483 {
    private final Production24_483 production = new Production24_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}