package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_473 {
    private final Production95_473 production = new Production95_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}