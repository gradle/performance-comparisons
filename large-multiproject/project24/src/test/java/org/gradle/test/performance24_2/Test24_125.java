package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_125 {
    private final Production24_125 production = new Production24_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}