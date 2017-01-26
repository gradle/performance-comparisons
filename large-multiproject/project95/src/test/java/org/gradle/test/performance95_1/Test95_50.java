package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_50 {
    private final Production95_50 production = new Production95_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}