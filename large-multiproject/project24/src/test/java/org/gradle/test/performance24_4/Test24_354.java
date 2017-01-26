package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_354 {
    private final Production24_354 production = new Production24_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}