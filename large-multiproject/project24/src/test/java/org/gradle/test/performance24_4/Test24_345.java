package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_345 {
    private final Production24_345 production = new Production24_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}