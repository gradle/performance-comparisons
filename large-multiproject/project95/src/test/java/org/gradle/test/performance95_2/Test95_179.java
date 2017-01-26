package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_179 {
    private final Production95_179 production = new Production95_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}