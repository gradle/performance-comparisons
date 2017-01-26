package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_399 {
    private final Production95_399 production = new Production95_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}