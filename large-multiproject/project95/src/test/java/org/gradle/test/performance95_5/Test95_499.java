package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_499 {
    private final Production95_499 production = new Production95_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}