package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_185 {
    private final Production95_185 production = new Production95_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}