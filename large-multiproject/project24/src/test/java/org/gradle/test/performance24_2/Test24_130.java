package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_130 {
    private final Production24_130 production = new Production24_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}