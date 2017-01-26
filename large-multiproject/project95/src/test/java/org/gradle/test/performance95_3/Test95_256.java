package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_256 {
    private final Production95_256 production = new Production95_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}