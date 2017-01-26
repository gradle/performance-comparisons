package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_407 {
    private final Production95_407 production = new Production95_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}