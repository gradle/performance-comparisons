package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_499 {
    private final Production24_499 production = new Production24_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}