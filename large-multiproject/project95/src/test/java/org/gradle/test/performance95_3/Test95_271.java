package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_271 {
    private final Production95_271 production = new Production95_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}