package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_236 {
    private final Production24_236 production = new Production24_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}