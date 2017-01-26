package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_493 {
    private final Production95_493 production = new Production95_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}