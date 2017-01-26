package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_165 {
    private final Production24_165 production = new Production24_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}