package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_190 {
    private final Production24_190 production = new Production24_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}