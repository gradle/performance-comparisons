package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_317 {
    private final Production24_317 production = new Production24_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}