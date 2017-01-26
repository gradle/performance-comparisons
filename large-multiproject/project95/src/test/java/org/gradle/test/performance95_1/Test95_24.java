package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_24 {
    private final Production95_24 production = new Production95_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}