package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_451 {
    private final Production95_451 production = new Production95_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}