package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_323 {
    private final Production13_323 production = new Production13_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}