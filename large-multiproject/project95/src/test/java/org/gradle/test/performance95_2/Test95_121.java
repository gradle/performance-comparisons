package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_121 {
    private final Production95_121 production = new Production95_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}