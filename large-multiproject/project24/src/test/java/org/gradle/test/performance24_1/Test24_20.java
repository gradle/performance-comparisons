package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_20 {
    private final Production24_20 production = new Production24_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}