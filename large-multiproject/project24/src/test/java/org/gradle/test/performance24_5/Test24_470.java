package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_470 {
    private final Production24_470 production = new Production24_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}