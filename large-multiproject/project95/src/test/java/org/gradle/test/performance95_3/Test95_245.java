package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_245 {
    private final Production95_245 production = new Production95_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}