package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_171 {
    private final Production24_171 production = new Production24_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}