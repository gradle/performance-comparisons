package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_275 {
    private final Production95_275 production = new Production95_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}