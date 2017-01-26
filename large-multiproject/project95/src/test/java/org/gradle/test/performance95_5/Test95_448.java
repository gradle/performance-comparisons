package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_448 {
    private final Production95_448 production = new Production95_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}