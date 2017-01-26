package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_459 {
    private final Production95_459 production = new Production95_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}