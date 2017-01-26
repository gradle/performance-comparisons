package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_342 {
    private final Production24_342 production = new Production24_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}