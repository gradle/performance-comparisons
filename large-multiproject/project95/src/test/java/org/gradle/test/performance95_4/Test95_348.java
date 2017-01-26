package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_348 {
    private final Production95_348 production = new Production95_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}