package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_141 {
    private final Production95_141 production = new Production95_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}