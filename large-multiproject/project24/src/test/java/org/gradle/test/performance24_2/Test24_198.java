package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_198 {
    private final Production24_198 production = new Production24_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}