package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_316 {
    private final Production95_316 production = new Production95_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}