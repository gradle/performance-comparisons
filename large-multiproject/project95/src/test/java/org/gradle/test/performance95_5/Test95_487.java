package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_487 {
    private final Production95_487 production = new Production95_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}