package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_258 {
    private final Production95_258 production = new Production95_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}