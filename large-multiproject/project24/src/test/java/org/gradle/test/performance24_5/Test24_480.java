package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_480 {
    private final Production24_480 production = new Production24_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}