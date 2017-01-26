package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_453 {
    private final Production95_453 production = new Production95_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}