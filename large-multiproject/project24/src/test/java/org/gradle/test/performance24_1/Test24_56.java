package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_56 {
    private final Production24_56 production = new Production24_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}