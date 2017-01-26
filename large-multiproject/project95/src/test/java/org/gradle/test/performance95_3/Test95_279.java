package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_279 {
    private final Production95_279 production = new Production95_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}