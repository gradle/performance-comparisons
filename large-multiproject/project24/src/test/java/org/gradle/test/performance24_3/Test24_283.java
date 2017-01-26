package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_283 {
    private final Production24_283 production = new Production24_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}