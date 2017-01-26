package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_130 {
    private final Production95_130 production = new Production95_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}