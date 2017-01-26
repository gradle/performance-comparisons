package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_410 {
    private final Production24_410 production = new Production24_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}