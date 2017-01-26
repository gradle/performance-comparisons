package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_226 {
    private final Production24_226 production = new Production24_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}