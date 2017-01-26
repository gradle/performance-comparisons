package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_110 {
    private final Production95_110 production = new Production95_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}