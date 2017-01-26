package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_304 {
    private final Production24_304 production = new Production24_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}