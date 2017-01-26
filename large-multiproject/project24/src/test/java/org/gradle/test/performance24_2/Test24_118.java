package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_118 {
    private final Production24_118 production = new Production24_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}