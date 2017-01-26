package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_83 {
    private final Production24_83 production = new Production24_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}