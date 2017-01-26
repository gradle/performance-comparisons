package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_79 {
    private final Production95_79 production = new Production95_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}