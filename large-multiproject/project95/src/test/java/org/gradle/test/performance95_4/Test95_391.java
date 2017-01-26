package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_391 {
    private final Production95_391 production = new Production95_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}