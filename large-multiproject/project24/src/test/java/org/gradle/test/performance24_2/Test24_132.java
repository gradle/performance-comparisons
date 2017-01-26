package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_132 {
    private final Production24_132 production = new Production24_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}