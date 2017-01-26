package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_117 {
    private final Production95_117 production = new Production95_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}