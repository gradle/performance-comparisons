package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_132 {
    private final Production95_132 production = new Production95_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}