package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_124 {
    private final Production24_124 production = new Production24_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}