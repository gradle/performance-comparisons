package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_459 {
    private final Production24_459 production = new Production24_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}