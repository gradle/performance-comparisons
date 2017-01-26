package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_379 {
    private final Production24_379 production = new Production24_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}