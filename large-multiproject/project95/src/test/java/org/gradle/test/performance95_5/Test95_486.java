package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_486 {
    private final Production95_486 production = new Production95_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}