package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_395 {
    private final Production24_395 production = new Production24_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}