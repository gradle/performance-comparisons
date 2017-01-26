package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_332 {
    private final Production95_332 production = new Production95_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}