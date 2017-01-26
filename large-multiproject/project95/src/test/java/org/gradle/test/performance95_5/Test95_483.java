package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_483 {
    private final Production95_483 production = new Production95_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}