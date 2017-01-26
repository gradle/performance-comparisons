package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_433 {
    private final Production95_433 production = new Production95_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}