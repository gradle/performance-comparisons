package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_346 {
    private final Production95_346 production = new Production95_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}