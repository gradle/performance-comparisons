package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_115 {
    private final Production24_115 production = new Production24_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}