package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_273 {
    private final Production95_273 production = new Production95_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}