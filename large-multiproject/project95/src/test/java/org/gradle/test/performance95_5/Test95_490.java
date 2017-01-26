package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_490 {
    private final Production95_490 production = new Production95_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}