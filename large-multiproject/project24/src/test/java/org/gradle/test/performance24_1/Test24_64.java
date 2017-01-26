package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_64 {
    private final Production24_64 production = new Production24_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}