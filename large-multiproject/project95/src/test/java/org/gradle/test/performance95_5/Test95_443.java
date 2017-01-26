package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_443 {
    private final Production95_443 production = new Production95_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}