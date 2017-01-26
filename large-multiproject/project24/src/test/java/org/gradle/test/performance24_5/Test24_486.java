package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_486 {
    private final Production24_486 production = new Production24_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}