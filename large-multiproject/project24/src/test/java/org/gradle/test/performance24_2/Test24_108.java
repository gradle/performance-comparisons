package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_108 {
    private final Production24_108 production = new Production24_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}