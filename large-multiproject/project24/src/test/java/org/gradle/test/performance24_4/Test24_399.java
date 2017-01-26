package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_399 {
    private final Production24_399 production = new Production24_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}