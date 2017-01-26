package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_327 {
    private final Production95_327 production = new Production95_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}