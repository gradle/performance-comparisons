package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_208 {
    private final Production24_208 production = new Production24_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}