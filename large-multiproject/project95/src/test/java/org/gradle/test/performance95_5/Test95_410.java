package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_410 {
    private final Production95_410 production = new Production95_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}