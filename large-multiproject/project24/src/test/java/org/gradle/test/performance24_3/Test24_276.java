package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_276 {
    private final Production24_276 production = new Production24_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}