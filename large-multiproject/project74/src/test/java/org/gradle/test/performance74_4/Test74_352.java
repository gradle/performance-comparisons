package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_352 {
    private final Production74_352 production = new Production74_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}