package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_233 {
    private final Production95_233 production = new Production95_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}