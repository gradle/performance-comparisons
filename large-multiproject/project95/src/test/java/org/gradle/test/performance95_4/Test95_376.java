package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_376 {
    private final Production95_376 production = new Production95_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}