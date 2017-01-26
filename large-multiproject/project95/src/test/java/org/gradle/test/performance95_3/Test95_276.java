package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_276 {
    private final Production95_276 production = new Production95_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}