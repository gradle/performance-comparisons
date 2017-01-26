package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_295 {
    private final Production95_295 production = new Production95_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}