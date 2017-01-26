package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_124 {
    private final Production95_124 production = new Production95_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}