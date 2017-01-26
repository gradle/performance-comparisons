package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_118 {
    private final Production95_118 production = new Production95_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}