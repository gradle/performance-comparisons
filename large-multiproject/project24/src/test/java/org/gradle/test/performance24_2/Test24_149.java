package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_149 {
    private final Production24_149 production = new Production24_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}