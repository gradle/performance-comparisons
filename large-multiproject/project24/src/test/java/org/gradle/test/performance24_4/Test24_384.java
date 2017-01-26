package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_384 {
    private final Production24_384 production = new Production24_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}