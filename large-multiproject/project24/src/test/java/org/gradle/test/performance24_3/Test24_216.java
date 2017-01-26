package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_216 {
    private final Production24_216 production = new Production24_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}