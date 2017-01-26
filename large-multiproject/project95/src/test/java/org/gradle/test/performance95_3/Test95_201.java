package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_201 {
    private final Production95_201 production = new Production95_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}