package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_164 {
    private final Production24_164 production = new Production24_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}