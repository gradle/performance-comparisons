package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_355 {
    private final Production95_355 production = new Production95_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}