package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_206 {
    private final Production95_206 production = new Production95_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}