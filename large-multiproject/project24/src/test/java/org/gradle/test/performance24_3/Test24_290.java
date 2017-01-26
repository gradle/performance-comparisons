package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_290 {
    private final Production24_290 production = new Production24_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}