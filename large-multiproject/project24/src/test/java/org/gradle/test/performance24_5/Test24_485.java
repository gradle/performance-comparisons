package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_485 {
    private final Production24_485 production = new Production24_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}