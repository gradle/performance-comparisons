package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_232 {
    private final Production24_232 production = new Production24_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}