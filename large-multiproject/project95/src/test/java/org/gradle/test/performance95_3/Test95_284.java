package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_284 {
    private final Production95_284 production = new Production95_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}