package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_262 {
    private final Production95_262 production = new Production95_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}