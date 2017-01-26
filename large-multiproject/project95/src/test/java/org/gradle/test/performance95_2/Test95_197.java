package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_197 {
    private final Production95_197 production = new Production95_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}