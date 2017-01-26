package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_359 {
    private final Production95_359 production = new Production95_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}