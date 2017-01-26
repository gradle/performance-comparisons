package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_318 {
    private final Production24_318 production = new Production24_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}