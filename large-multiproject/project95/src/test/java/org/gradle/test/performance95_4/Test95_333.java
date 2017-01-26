package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_333 {
    private final Production95_333 production = new Production95_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}