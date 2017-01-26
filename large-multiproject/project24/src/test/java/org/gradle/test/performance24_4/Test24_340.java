package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_340 {
    private final Production24_340 production = new Production24_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}