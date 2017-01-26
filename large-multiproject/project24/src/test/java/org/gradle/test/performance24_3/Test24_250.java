package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_250 {
    private final Production24_250 production = new Production24_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}