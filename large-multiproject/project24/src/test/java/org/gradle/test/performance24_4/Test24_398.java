package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_398 {
    private final Production24_398 production = new Production24_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}