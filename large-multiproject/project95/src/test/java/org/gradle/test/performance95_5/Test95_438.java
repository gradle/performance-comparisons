package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_438 {
    private final Production95_438 production = new Production95_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}