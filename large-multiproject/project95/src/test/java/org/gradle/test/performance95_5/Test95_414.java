package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_414 {
    private final Production95_414 production = new Production95_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}