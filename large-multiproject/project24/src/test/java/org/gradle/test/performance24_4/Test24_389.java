package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_389 {
    private final Production24_389 production = new Production24_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}