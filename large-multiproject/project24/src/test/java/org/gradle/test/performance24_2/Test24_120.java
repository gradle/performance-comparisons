package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_120 {
    private final Production24_120 production = new Production24_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}