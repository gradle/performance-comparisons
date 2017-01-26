package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_55 {
    private final Production24_55 production = new Production24_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}