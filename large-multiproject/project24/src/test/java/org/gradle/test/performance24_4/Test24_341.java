package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_341 {
    private final Production24_341 production = new Production24_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}