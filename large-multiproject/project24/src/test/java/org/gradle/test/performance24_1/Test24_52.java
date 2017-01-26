package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_52 {
    private final Production24_52 production = new Production24_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}