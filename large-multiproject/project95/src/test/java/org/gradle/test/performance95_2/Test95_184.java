package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_184 {
    private final Production95_184 production = new Production95_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}