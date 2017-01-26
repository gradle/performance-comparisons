package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_400 {
    private final Production24_400 production = new Production24_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}