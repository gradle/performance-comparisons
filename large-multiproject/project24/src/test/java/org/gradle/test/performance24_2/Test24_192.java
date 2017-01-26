package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_192 {
    private final Production24_192 production = new Production24_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}