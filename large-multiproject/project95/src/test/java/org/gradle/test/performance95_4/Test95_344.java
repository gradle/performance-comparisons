package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_344 {
    private final Production95_344 production = new Production95_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}