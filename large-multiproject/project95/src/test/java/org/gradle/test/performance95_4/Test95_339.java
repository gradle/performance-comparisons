package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_339 {
    private final Production95_339 production = new Production95_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}