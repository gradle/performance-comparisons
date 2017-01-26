package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_408 {
    private final Production95_408 production = new Production95_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}