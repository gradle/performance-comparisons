package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_250 {
    private final Production95_250 production = new Production95_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}