package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_223 {
    private final Production95_223 production = new Production95_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}