package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_372 {
    private final Production95_372 production = new Production95_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}