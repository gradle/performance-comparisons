package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_240 {
    private final Production95_240 production = new Production95_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}