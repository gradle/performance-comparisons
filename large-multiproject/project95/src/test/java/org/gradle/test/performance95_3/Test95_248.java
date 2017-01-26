package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_248 {
    private final Production95_248 production = new Production95_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}