package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_256 {
    private final Production24_256 production = new Production24_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}