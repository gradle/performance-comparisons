package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_105 {
    private final Production24_105 production = new Production24_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}