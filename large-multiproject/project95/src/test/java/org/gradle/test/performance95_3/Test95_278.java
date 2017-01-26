package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_278 {
    private final Production95_278 production = new Production95_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}