package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_349 {
    private final Production24_349 production = new Production24_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}