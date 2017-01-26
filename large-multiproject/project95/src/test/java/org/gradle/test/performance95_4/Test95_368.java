package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_368 {
    private final Production95_368 production = new Production95_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}