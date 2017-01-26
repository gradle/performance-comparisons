package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_363 {
    private final Production24_363 production = new Production24_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}