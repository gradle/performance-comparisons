package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_421 {
    private final Production24_421 production = new Production24_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}