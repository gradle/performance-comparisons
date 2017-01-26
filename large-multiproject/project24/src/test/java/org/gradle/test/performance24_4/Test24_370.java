package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_370 {
    private final Production24_370 production = new Production24_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}