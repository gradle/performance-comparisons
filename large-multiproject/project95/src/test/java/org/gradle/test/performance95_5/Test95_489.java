package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_489 {
    private final Production95_489 production = new Production95_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}