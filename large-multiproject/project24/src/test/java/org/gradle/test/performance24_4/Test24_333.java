package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_333 {
    private final Production24_333 production = new Production24_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}