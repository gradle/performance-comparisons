package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_312 {
    private final Production95_312 production = new Production95_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}