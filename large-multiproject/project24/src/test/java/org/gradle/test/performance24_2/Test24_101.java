package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_101 {
    private final Production24_101 production = new Production24_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}