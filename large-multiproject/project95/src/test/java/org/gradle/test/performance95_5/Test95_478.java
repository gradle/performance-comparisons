package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_478 {
    private final Production95_478 production = new Production95_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}