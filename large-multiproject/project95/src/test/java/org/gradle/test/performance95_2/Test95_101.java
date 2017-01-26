package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_101 {
    private final Production95_101 production = new Production95_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}