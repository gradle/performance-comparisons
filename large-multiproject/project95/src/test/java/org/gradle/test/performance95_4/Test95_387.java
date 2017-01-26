package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_387 {
    private final Production95_387 production = new Production95_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}