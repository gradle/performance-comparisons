package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_394 {
    private final Production95_394 production = new Production95_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}