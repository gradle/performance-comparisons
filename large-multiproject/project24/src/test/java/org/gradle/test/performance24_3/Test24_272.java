package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_272 {
    private final Production24_272 production = new Production24_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}