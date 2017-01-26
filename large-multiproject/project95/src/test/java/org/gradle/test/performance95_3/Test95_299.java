package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_299 {
    private final Production95_299 production = new Production95_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}