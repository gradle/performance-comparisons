package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_271 {
    private final Production24_271 production = new Production24_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}