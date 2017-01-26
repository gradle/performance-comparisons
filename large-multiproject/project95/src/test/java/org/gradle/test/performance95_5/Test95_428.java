package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_428 {
    private final Production95_428 production = new Production95_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}