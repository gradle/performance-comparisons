package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_261 {
    private final Production24_261 production = new Production24_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}