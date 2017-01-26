package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_213 {
    private final Production24_213 production = new Production24_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}