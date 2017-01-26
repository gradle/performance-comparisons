package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_431 {
    private final Production24_431 production = new Production24_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}