package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_429 {
    private final Production95_429 production = new Production95_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}