package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_11 {
    private final Production95_11 production = new Production95_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}