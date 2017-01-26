package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_384 {
    private final Production95_384 production = new Production95_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}