package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_311 {
    private final Production24_311 production = new Production24_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}