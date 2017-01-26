package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_389 {
    private final Production95_389 production = new Production95_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}