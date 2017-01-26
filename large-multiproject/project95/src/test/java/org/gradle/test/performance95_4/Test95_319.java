package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_319 {
    private final Production95_319 production = new Production95_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}