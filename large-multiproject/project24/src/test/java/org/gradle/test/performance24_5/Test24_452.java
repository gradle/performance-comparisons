package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_452 {
    private final Production24_452 production = new Production24_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}