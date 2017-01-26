package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_321 {
    private final Production24_321 production = new Production24_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}