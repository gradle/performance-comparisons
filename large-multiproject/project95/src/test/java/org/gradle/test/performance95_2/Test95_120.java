package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_120 {
    private final Production95_120 production = new Production95_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}