package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_484 {
    private final Production24_484 production = new Production24_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}