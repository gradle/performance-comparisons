package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_470 {
    private final Production95_470 production = new Production95_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}