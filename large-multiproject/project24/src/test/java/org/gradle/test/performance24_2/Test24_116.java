package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_116 {
    private final Production24_116 production = new Production24_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}