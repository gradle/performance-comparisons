package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_194 {
    private final Production95_194 production = new Production95_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}